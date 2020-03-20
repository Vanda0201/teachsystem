package com.example.vanda.share;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class LeaveActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView begin_time;
    private TextView end_time;
    private Calendar calendar;
    private int year,month,day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave);
        //返回键
        ImageView leaveback = (ImageView)findViewById(R.id.title_back);
        leaveback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        //日期
        getDate();
        begin_time = (TextView)findViewById(R.id.begin_time);
        begin_time.setOnClickListener(this);
        end_time = (TextView)findViewById(R.id.end_time);
        end_time.setOnClickListener(this);
    }

    //获取当前日期
    private void getDate(){
        calendar=Calendar.getInstance();
        year=calendar.get(Calendar.YEAR);
        month=calendar.get(Calendar.MONTH);
        day=calendar.get(Calendar.DAY_OF_MONTH);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.begin_time:
                DatePickerDialog.OnDateSetListener listener1=new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker arg0, int year, int month, int day) {
                        begin_time.setText(year+"-"+(++month)+"-"+day);
                    }
                };
                DatePickerDialog dialog1=new DatePickerDialog(LeaveActivity.this,DatePickerDialog.THEME_HOLO_LIGHT,listener1,year,month,day);
                dialog1.show();
                break;
            case  R.id.end_time:
                DatePickerDialog.OnDateSetListener listener2=new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        end_time.setText(year+"-"+(++month)+"-"+day);
                    }
                };
                DatePickerDialog dialog2=new DatePickerDialog(LeaveActivity.this,DatePickerDialog.THEME_HOLO_LIGHT,listener2,year,month,day);
                dialog2.show();
                break;

            default:
                break;
        }
    }
}
