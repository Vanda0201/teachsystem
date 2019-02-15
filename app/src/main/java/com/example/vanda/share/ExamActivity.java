package com.example.vanda.share;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ExamActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        //从该activity跳转回首页的fragment
        ImageView backBtn = (ImageView) findViewById(R.id.certificateback);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        List<ExamList> datas = initData();
        listView = (ListView) findViewById(R.id.listView);


//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivityceshi.this,android.R.layout.simple_list_item_1,array_data);
        ExamListAdapter adapter = new ExamListAdapter(ExamActivity.this, R.layout.exam_list_item, datas);
        listView.setAdapter(adapter);
    }


    private List<ExamList> initData() {
        List<ExamList> datas = new ArrayList<ExamList>();
        return datas;

    }


    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String name = data.getStringExtra("name");
                Toast.makeText(ExamActivity.this, name, Toast.LENGTH_LONG).show();
            }
        }
    }


}

