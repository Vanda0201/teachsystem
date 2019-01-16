package com.example.vanda.share;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


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

        LinearLayout order = view.findViewById(R.id.order);
        LinearLayout collection = view.findViewById(R.id.collection);
        LinearLayout publish = view.findViewById(R.id.publish);
        LinearLayout upload = view.findViewById(R.id.upload);
        LinearLayout download = view.findViewById(R.id.download);
        LinearLayout contactus = view.findViewById(R.id.contact_us);
        ImageView settings = view.findViewById(R.id.settings);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Util.isLogin(getContext())) {
                    startActivity(new Intent(getContext(), MyOrderActivity.class));
                } else {
                    startActivity(new Intent(getContext(), LoginActivity.class));
                }

            }
        });

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
                    startActivity(new Intent(getContext(), MyPublishActivity.class));
                } else {
                    startActivity(new Intent(getContext(), LoginActivity.class));
                }

            }
        });

        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Util.isLogin(getContext())) {
                    startActivity(new Intent(getContext(), MyDownloadActivity.class));
                } else {
                    startActivity(new Intent(getContext(), LoginActivity.class));
                }

            }
        });

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Util.isLogin(getContext())) {
                    startActivity(new Intent(getContext(), MyUploadActivity.class));
                } else {
                    startActivity(new Intent(getContext(), LoginActivity.class));
                }

            }
        });

        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), ContactUsActivity.class));


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