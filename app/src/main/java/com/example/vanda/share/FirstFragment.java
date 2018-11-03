package com.example.vanda.share;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

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
        LinearLayout kaozhengimage = view.findViewById(R.id.zhengshu);
        ImageButton shangchuan =view.findViewById(R.id.uploadbutton);

        kaozhengimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 startActivity(new Intent(getContext(),CertificateActivity.class));

            }
        });
        shangchuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(),UploadActivity.class));
            }
        });
        return view;
    }


}
