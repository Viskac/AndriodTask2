package com.example.task_thr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    //创建一个存放date的方法
    private List<Bean> date;
    private Context context;
//构造方法
    public MyAdapter(List<Bean> date, Context context) {
        this.date = date;
        this.context = context;
    }

    @Override
    public int getCount() {//获取全部数据
        return date.size();//date有多少数据就显示多少
    }

    @Override
    public Object getItem(int position) {//获取Item
        return null;
    }

    @Override
    public long getItemId(int position) {//获取Item的id
        return position;
    }

    @Override
    //返回view
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            //获取iten的布局
            //渲染list_item
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        }
        TextView textView = convertView.findViewById(R.id.tv);//拿到item里的textview
        textView.setText(date.get(position).getName());

        return convertView;
    }
}
