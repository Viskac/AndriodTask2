package com.example.task_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        Bundle bd = i.getBundleExtra("date");
    //拆包，获取每个值
        TextView name2 = findViewById(R.id.name2);//姓名
        name2.setText(bd.getString("name"));
        TextView number2 = findViewById(R.id.number2);//学号
        number2.setText(bd.getString("number"));
        TextView prof2 = findViewById(R.id.prof2);//专业
        prof2.setText(bd.getString("prof"));
        TextView sex2 = findViewById(R.id.sex2);//性别
        sex2.setText(bd.getString("sex"));
        TextView fun2 = findViewById(R.id.fun2);//兴趣
        fun2.setText(bd.getString("fun"));
        TextView cpc2 = findViewById(R.id.cpc2);//党员
        cpc2.setText(bd.getString("cpc"));
    }

    public void starMainActivity1(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
    }
}