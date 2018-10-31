package com.example.vanda.share;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    public FirstFragment() {
        // Required empty public constructor
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.frgment_first, container, false);
        view = inflater.inflate(R.layout.frgment_first,container,false);
        ImageView kaozhengimage = view.findViewById(R.id.imageView2);
        ImageButton shangchuan =view.findViewById(R.id.imageButton4);

        kaozhengimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),KaoZhengActivity.class));
            }
        });

        shangchuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),ShangChuanActivity.class));
            }
        });
        return view;
    }


}
