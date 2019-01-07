package com.example.vanda.share;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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


        List<Fruit> datas = initData();
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
        FruitAdapter adapter = new FruitAdapter(CertificateActivity.this, R.layout.fruit_item, datas);
        listView.setAdapter(adapter);
    }


    private List<Fruit> initData() {
        List<Fruit> datas = new ArrayList<Fruit>();
        datas.add(new Fruit(R.drawable.exp_touxiang1, "淮师一枝花"));
        datas.add(new Fruit(R.drawable.exp_touxiang2, "402-1扛把子"));
        datas.add(new Fruit(R.drawable.exp_touxiang11, "皮皮虾"));
        datas.add(new Fruit(R.drawable.exp_touxiang12, "七彩宝龙"));
        datas.add(new Fruit(R.drawable.exp_touxiang22, "ABaby"));
        datas.add(new Fruit(R.drawable.exp_touxiang21, "Apple"));
        datas.add(new Fruit(R.drawable.exp_touxiang19, "Apple"));
        datas.add(new Fruit(R.drawable.exp_touxiang18, "banana"));
        datas.add(new Fruit(R.drawable.exp_touxiang16, "Apple"));
        datas.add(new Fruit(R.drawable.exp_touxiang15, "Apple"));
        datas.add(new Fruit(R.drawable.exp_touxiang20, "banana"));
        datas.add(new Fruit(R.drawable.exp_touxiang2, "Apple"));
        datas.add(new Fruit(R.drawable.exp_touxiang20, "Apple"));
        datas.add(new Fruit(R.drawable.exp_apple, "banana"));

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

