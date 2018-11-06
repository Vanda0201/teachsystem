package com.example.vanda.share;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ResourceCursorTreeAdapter;
import android.widget.TextView;
import android.widget.ViewFlipper;

import static com.example.vanda.share.R.*;
import static com.example.vanda.share.R.animator.*;

public class MainActivity extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case id.navigation_shouye:
                   replaceFragment(new FirstFragment());
                    // mTextMessage.setText(R.string.title_home);
                    return true;
                case id.navigation_shangcheng:
                  replaceFragment(new SecondFragment());
                    //mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case id.navigation_wode:
                    replaceFragment(new ThirdFragment());
                    // mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(id.content, fragment);
        transaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        //appy运行指定首画面
        navigation.setSelectedItemId(id.navigation_shouye);
    }
        //悦享头条
//        @SuppressLint("ResourceType")
//        public View onCreateView(LayoutInflater inflater,
//                                 ViewGroup container, Bundle savedInstanceState) {
//            // TODO Auto-generated method stub
//            View view = inflater.inflate(layout.frgment_first,container,false);
//            ViewFlipper flipper = (ViewFlipper) view.findViewById(id.vf);
//            flipper.setInAnimation(this.getBaseContext(),right_in);
//            flipper.setOutAnimation(this.getBaseContext(),right_out);
//            flipper.startFlipping();
//            return view;
//   }


}
