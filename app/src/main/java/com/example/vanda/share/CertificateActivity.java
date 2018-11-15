package com.example.vanda.share;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class CertificateActivity extends AppCompatActivity {

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
            ListView listView = (ListView)findViewById(R.id.listView) ;
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivityceshi.this,android.R.layout.simple_list_item_1,array_data);
        FruitAdapter adapter = new FruitAdapter(CertificateActivity.this,R.layout.fruit_item, datas);

        listView.setAdapter(adapter);
    }

    private List<Fruit> initData() {
        List<Fruit> datas = new ArrayList<Fruit>();
        datas.add(new Fruit(R.drawable.exp_touxiang1,"淮师一枝花"));
        datas.add(new Fruit(R.drawable.exp_touxiang2,"402-1扛把子"));
        datas.add(new Fruit(R.drawable.exp_apple,"皮皮虾"));
        datas.add(new Fruit(R.drawable.exp_apple,"七彩宝龙"));
        datas.add(new Fruit(R.drawable.img_express,"ABaby"));
        datas.add(new Fruit(R.drawable.exp_apple,"Apple"));
        datas.add(new Fruit(R.drawable.exp_apple,"Apple"));
        datas.add(new Fruit(R.drawable.exp_apple,"banana"));
        datas.add(new Fruit(R.drawable.exp_apple,"Apple"));
        datas.add(new Fruit(R.drawable.exp_apple,"Apple"));
        datas.add(new Fruit(R.drawable.exp_apple,"banana"));
        datas.add(new Fruit(R.drawable.exp_apple,"Apple"));
        datas.add(new Fruit(R.drawable.exp_apple,"Apple"));
        datas.add(new Fruit(R.drawable.exp_apple,"banana"));

        return datas;

    }



    protected void onActivityResult(int requestCode, int resultCode,@Nullable Intent data) {
        if(requestCode==1){if(resultCode==RESULT_OK)
        {String name=data.getStringExtra("name");
            Toast.makeText(CertificateActivity.this,name,Toast.LENGTH_LONG).show();}
        }
    }




}

