package com.example.vanda.share;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class Util {
    public static boolean isLogin(Context myContext){
        SharedPreferences sharedPreferences = myContext.getSharedPreferences("user",0);
        String user_name = sharedPreferences.getString("user_name","");
        if("".equals(user_name)){
           return false;
        }
        return true;
    }
}
