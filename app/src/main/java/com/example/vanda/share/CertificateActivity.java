package com.example.vanda.share;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CertificateActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_certificate);

        //从该activity跳转回首页的fragment
        ImageView backBtn = (ImageView) findViewById(R.id.certificateback);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        List<CertificateList> datas = initData();
        listView = (ListView) findViewById(R.id.listView);
        //跳转到资源详情
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(), Resource_detailsActivity.class);
                startActivity(intent);
            }
        });


//       ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivityceshi.this,android.R.layout.simple_list_item_1,array_data);
        CertificateListAdapter adapter = new CertificateListAdapter(CertificateActivity.this, R.layout.certificate_list_item, datas);
        listView.setAdapter(adapter);
    }


    private List<CertificateList> initData() {
        List<CertificateList> datas = new ArrayList<CertificateList>();

        return datas;

    }


    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String name = data.getStringExtra("name");
                Toast.makeText(CertificateActivity.this, name, Toast.LENGTH_LONG).show();
            }
        }
    }


}

