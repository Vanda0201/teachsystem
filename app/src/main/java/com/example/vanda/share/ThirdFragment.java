package com.example.vanda.share;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {


    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.frgment_third, container, false);

        TextView collection = view.findViewById(R.id.collection);
        TextView publish = view.findViewById(R.id.publish);
        TextView upload = view.findViewById(R.id.upload);
        TextView download = view.findViewById(R.id.download);
        TextView contactus = view.findViewById(R.id.contact_us);
        ImageView settings = view.findViewById(R.id.settings);

        collection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (Util.isLogin(getContext())) {
                    startActivity(new Intent(getContext(), CollectionActivity.class));
                } else {
                   startActivity(new Intent(getContext(), LoginActivity.class));
                }

            }
        });

        publish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Util.isLogin(getContext())) {
                    startActivity(new Intent(getContext(), MyPublish.class));
                } else {
                    startActivity(new Intent(getContext(), LoginActivity.class));
                }

            }
        });

        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Util.isLogin(getContext())) {
                    startActivity(new Intent(getContext(), MyDownload.class));
                } else {
                    startActivity(new Intent(getContext(), LoginActivity.class));
                }

            }
        });

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Util.isLogin(getContext())) {
                    startActivity(new Intent(getContext(), MyUpload.class));
                } else {
                    startActivity(new Intent(getContext(), LoginActivity.class));
                }

            }
        });

        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    startActivity(new Intent(getContext(), ContactUs.class));


            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Util.isLogin(getContext())) {
                    startActivity(new Intent(getContext(), SettingActivity.class));
                } else {
                    startActivity(new Intent(getContext(), LoginActivity.class));
                }

            }
        });








        return view;
    }

}




