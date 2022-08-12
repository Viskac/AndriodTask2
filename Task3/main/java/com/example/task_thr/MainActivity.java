package com.example.task_thr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Bean> date = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] array = {"苹果","西瓜","桔子","香蕉","葡萄","草莓","梨子","樱桃","菠萝","桃子"
                ,"哈密瓜","木瓜","芒果","柚子","榴莲","柿子","李子","猕猴桃","荔枝","杏子" };
        //Collections.addAll(date,array);
        for (int i=0;i<20;i++){ //文本内容
            Bean bean = new Bean();
            bean.setName((i+1)+array[i]);
            date.add(bean);
        }
        ListView listView = findViewById(R.id.lv);
        //把数据放进Adapter
        listView.setAdapter(new MyAdapter(date,this));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.e("TAG", "onItemClick: "+position);
                Toast.makeText(getApplicationContext(),
                        date.get(position).getName(),Toast.LENGTH_SHORT ).show();
            }
        });
    }
}