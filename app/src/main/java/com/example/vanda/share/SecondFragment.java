package com.example.vanda.share;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment {
    RecyclerView recyclerView;
    List<GoodsItem> goodsList ;
    public SecondFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.frgment_second, container, false);
        ImageView shangchuan = view.findViewById(R.id.publishbutton);
        shangchuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),PublishActivity.class));
            }
        });

        //        演示用点击
        LinearLayout exlist = (LinearLayout)view.findViewById(R.id.ex_goods_details);
        exlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),Goods_detailsActivity.class));
            }
        });


        goodsList = new ArrayList<GoodsItem>();
        final GoodsAdapter goodsAdapter = new GoodsAdapter(goodsList);
        LinearLayoutManager layoutManager  = new LinearLayoutManager(getContext());
        recyclerView = view.findViewById(R.id.classify);
        recyclerView.setAdapter(goodsAdapter);
        recyclerView.setLayoutManager(layoutManager);

        LinearLayout recommendLayout = (LinearLayout)view.findViewById(R.id.recommend);
        recommendLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goodsList = getRecommendData();
                goodsAdapter.notifyDataSetChanged();
            }
        });

        return view;
    }
    List<GoodsItem> getRecommendData(){
        List<GoodsItem> result = new ArrayList<GoodsItem>();
        result.add(new GoodsItem("http://","apple"));
        result.add(new GoodsItem("http://","apple"));
        result.add(new GoodsItem("http://","apple"));
        return result;
    }
}
