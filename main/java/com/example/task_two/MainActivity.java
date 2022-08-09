package com.example.task_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nam,num,prof;
    private RadioButton man,women,bb,fb,vb,bm,yes,not,rb1,rb2,rb3;
    private RadioGroup rg_s,rg_f,rg_y;
   //private TextView textSex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // ButterKnife.bind(this);
        //获取EditText的值
        nam = findViewById(R.id.name);//姓名
        num = findViewById(R.id.number);//学号
        prof = findViewById(R.id.prof);//专业
        //获取RadioBox的值
        //性别
        man = findViewById(R.id.man);
        women = findViewById(R.id.women);
        rg_s= findViewById(R.id.rg_sex);
        rg_s.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
              //selectRadioButton();
                rb1 = (RadioButton) MainActivity.this.findViewById(rg_s.getCheckedRadioButtonId());
            }
        });
        //兴趣
        bb = findViewById(R.id.bb);
        fb = findViewById(R.id.fb);
        vb = findViewById(R.id.vb);
        bm = findViewById(R.id.bm);
        rg_f=findViewById(R.id.rg_fun);
        rg_f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //selectRadioButton();
                rb2 = (RadioButton) MainActivity.this.findViewById(rg_f.getCheckedRadioButtonId());
            }
        });
        //是否党员
        yes = findViewById(R.id.yes);
        not = findViewById(R.id.not);
        rg_y=findViewById(R.id.rg_yn);
        rg_y.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                //selectRadioButton();
                rb3 = (RadioButton) MainActivity.this.findViewById(rg_y.getCheckedRadioButtonId());
            }
        });

//        //监听
//        Button bt = findViewById(R.id.btn);
//        bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
//                //实例化bundle,封装
//                Bundle bundle = new Bundle();
//                //给bundle写入数据
//                bundle.putString("name",nam.getText().toString());
//                bundle.putString("number",num.getText().toString());
//                bundle.putString("prof",prof.getText().toString());
//                bundle.putString("sex",textSex.getText().toString());
//
//
//                intent.putExtra("date",bundle);//传递bundle数据包、
//                startActivity(intent);
//            }
//        });
//
    }

    public void starMainActivity2(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        //实例化bundle,封装
        Bundle bundle = new Bundle();
        //给bundle写入数据
        bundle.putString("name",nam.getText().toString());
        bundle.putString("number",num.getText().toString());
        bundle.putString("prof",prof.getText().toString());
        bundle.putString("sex",rb1.getText().toString());
        bundle.putString("fun",rb2.getText().toString());
        bundle.putString("cpc",rb3.getText().toString());

        intent.putExtra("date",bundle);//传递bundle数据包、
        startActivity(intent);
    }
}