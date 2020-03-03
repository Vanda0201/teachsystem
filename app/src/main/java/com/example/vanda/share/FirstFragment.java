package com.example.vanda.share;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
    ImageSlideshow imageSlideshow;
    private ViewFlipper view_flipper;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view ;
        view = inflater.inflate(R.layout.frgment_first, container, false);
        LinearLayout kaozhengimage = view.findViewById(R.id.shenpi);
        LinearLayout kaoshi = view.findViewById(R.id.exam);
        LinearLayout kaoyan = view.findViewById(R.id.postgraduate);
        LinearLayout kuaidi = view.findViewById(R.id.express);
        LinearLayout jianzhi = view.findViewById(R.id.job);
        LinearLayout zhoubian = view.findViewById(R.id.life);
        LinearLayout xinwen = view.findViewById(R.id.news);
        setTypeface(view);

        kaozhengimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), CertificateActivity.class));

            }
        });
        kaoshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ExamActivity.class));

            }
        });
        kaoyan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Postgraduate_examinationActivity.class));

            }
        });


        kuaidi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ExpressActivity.class));

            }
        });
        jianzhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), JobActivity.class));

            }
        });
        zhoubian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), LifeActivity.class));

            }
        });
        xinwen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), NewsActivity.class));

            }
        });


        imageSlideshow = (ImageSlideshow) view.findViewById(R.id.is_gallery);
//        imageUrlList = new ArrayList<>();
//        titleList = new ArrayList<>();
        imageSlideshow.setOnItemClickListener(new ImageSlideshow.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

            }
        });
        // 初始化数据
        initData();

        // 设置ImageSlideshow
        imageSlideshow.setDotSpace(12);
        imageSlideshow.setDotSize(12);
        imageSlideshow.setDelay(3000);
        imageSlideshow.commit();

        view_flipper = (ViewFlipper) view.findViewById(R.id.view_flipper);
        initView();
        return view;
    }

    private void initData() {
//        String[] imageUrls = {"http://pic3.zhimg.com/b5c5fc8e9141cb785ca3b0a1d037a9a2.jpg",
//                "http://pic2.zhimg.com/551fac8833ec0f9e0a142aa2031b9b09.jpg",
//                "http://pic2.zhimg.com/be6f444c9c8bc03baa8d79cecae40961.jpg",
//                "http://pic1.zhimg.com/b6f59c017b43937bb85a81f9269b1ae8.jpg",
//                "http://pic2.zhimg.com/a62f9985cae17fe535a99901db18eba9.jpg"};
        int[] imageIds = new int[]{R.drawable.ex_1, R.drawable.ex_2, R.drawable.ex_3, R.drawable.ex_4, R.drawable.ex_5, R.drawable.ex_6};
        String[] titles = {"",
                "",
                "",
                "",
                "",
                "",

        };
        for (int i = 0; i < 6; i++) {
//            imageSlideshow.addImageTitle(imageUrls[i], titles[i]);
            imageSlideshow.addImageTitleWithId(imageIds[i], titles[i]);
            // imageSlideshow.addImageId(imageIds[i]);

        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        imageSlideshow.releaseResource();
    }


    private void initView() {


        String[] imageId = new String[]{"1", "2", "3", "4", "5"};

        List<String> data = getNews();
        for (String news : data) {

            View view = getLayoutInflater().inflate(R.layout.item_flipper, null);
            TextView textView = view.findViewById(R.id.tv);

            textView.setText(news);
            textView.setTextColor(Color.rgb(0, 0, 0));
            view_flipper.addView(view);
        }
        view_flipper.setFlipInterval(3000);
        view_flipper.startFlipping();

    }

    private List<String> getNews() {
        List<String> news = new ArrayList<String>();
        news.add("探索悦享，一起成为仰望星空的人");
        news.add("今天也要努力工作！");
        news.add("官宣！--悦享只是想蹭个热度");
        news.add("悦享，互动分享资源新选择！");
        news.add("今天的你准备好了吗？");

        return news;
    }

    private void setTypeface(View view) {
        //获取控件
        TextView tv_main_text = (TextView) view.findViewById(R.id.Share);
        //设置字体
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/LoveLight.ttf");
        tv_main_text.setTypeface(typeface);

    }
}
