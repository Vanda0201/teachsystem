package com.example.vanda.share;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CertificateListAdapter extends ArrayAdapter {

    private int resource_id;

    public CertificateListAdapter(Context context, int textViewResourceId, List<CertificateList> objects) {
         super(context, textViewResourceId, objects);
        resource_id = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CertificateListAdapter certificateListAdapter = (CertificateListAdapter) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resource_id, parent, false);
        ImageView imageView = view.findViewById(R.id.imageView);

        TextView textView = view.findViewById(R.id.textView);

        imageView.setImageResource(CertificateList.getImage_id());

        textView.setText(CertificateList.getName());


        return view;

    }
}