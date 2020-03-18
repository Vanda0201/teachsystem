package com.example.vanda.share;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
//        返回键
        ImageView mypublishback = (ImageView) findViewById(R.id.title_back);
        Button buy = (Button) findViewById(R.id.download_buy);
        mypublishback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                duihuakuang();
            }

            private void duihuakuang() {
                AlertDialog.Builder bb = new AlertDialog.Builder(DetailsActivity.this);

                bb.setPositiveButton("确定购买", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                bb.setNegativeButton("我再看看", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });


                bb.setMessage("你确定要花费9.9元购买该商品吗？");
                bb.setTitle("购买提示");
                bb.show();
            }

        });


    }
}
