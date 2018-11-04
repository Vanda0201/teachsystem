package com.example.vanda.share;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        Button loginData =(Button) findViewById(R.id.register_button);
        loginData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = getSharedPreferences("user",MODE_PRIVATE).edit();
                editor.putString("user_name","Logged");
                editor.apply();
            }
        });
        //返回键
        ImageView registerback = (ImageView) findViewById(R.id.title_back);
        registerback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
