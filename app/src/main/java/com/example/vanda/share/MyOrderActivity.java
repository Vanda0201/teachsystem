package com.example.vanda.share;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MyOrderActivity extends SwipeLayoutActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_task);
        setSwipeAnyWhere(true);
        ImageView mycollectionback = (ImageView) findViewById(R.id.title_back);
        mycollectionback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
