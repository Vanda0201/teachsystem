package com.example.vanda.share;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Resource_detailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource_details);
        //返回键
        ImageView mypublishback = (ImageView) findViewById(R.id.title_back);
        Button download = (Button) findViewById(R.id.download_button);
        Button resourceCollect = (Button) findViewById(R.id.resourceCollect);
        mypublishback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                duihuakuang();
            }

            private void duihuakuang() {
                AlertDialog.Builder bb = new AlertDialog.Builder(Resource_detailsActivity.this);

                bb.setPositiveButton("下载", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                bb.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                bb.setMessage("你确定要花费2积分下载该文档吗？");
                bb.setTitle("下载提示");
                bb.show();
            }
        });
        resourceCollect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                duihuakuang();
            }

            private void duihuakuang() {
                AlertDialog.Builder bb = new AlertDialog.Builder(Resource_detailsActivity.this);

                bb.setPositiveButton("收藏", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                bb.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                bb.setMessage("你确定要收藏该文档吗？");
                bb.setTitle("收藏提示");
                bb.show();
            }
        });
    }
}