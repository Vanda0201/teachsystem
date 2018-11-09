package com.example.vanda.share;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GoodsAdapter extends RecyclerView.Adapter<GoodsAdapter.ViewHolder> {
    private List<GoodsItem> goods_list;

    public GoodsAdapter(List<GoodsItem> goods_list) {
        this.goods_list = goods_list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.goods_item_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        GoodsItem item = goods_list.get(i);
        String url = item.getImg_url();
        Bitmap bitmap = null;//TODO
        viewHolder.imageView.setImageBitmap(bitmap);
        viewHolder.textView.setText(item.getName());

    }

    @Override
    public int getItemCount() {
        return goods_list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.goods_img);
            textView = itemView.findViewById(R.id.goods_name);
        }
    }
}
