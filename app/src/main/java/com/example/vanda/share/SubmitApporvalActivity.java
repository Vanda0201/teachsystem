package com.example.vanda.share;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SubmitApporvalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_apporval);

        //返回
        ImageView backBtn = (ImageView) findViewById(R.id.submit_approvalback);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //请假
        LinearLayout leave =  findViewById(R.id.ask_for_leave);
        leave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(getApplicationContext(),LeaveActivity.class),1);
            }

        });

        /*AppManager.getAppManager().addActivity(this);*/
    }
/*
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==1){
            if(resultCode==RESULT_OK){
                String name = data.getStringExtra("state");
                Toast.makeText(SubmitApporvalActivity.this,name,Toast.LENGTH_LONG).show();
                Intent intent = new Intent();
                intent.putExtra("state","已提交，请等待审批");
                setResult(RESULT_OK,intent);
            }
        }
    }*/
}
