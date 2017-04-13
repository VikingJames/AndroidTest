package com.neu.viking.chaptertwo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.neu.viking.R;

import java.util.List;

/**
 * Created by Administrator on 2017/4/7.
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {
    private int resourceId;

    public FruitAdapter(Context context, int textViewResourceId, List<Fruit>objects) {
        super(context,textViewResourceId,objects);
        resourceId = textViewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = getItem(position); //获取当前项的Fruit实例
        /*first optimization
        View view;
        //重用之前已经加载过的界面
        if (null == convertView) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        } else {
            view =convertView;
        }*/
        //base
        //View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        View view;
        ViewHolder viewHolder;
        if (null == convertView) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.fruitImage = (ImageView)view.findViewById(R.id.fruit_image);
            viewHolder.fruitName = (TextView)view.findViewById(R.id.fruit_name);
            view.setTag(viewHolder);//将ViewHolder保存在View中
        } else {
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }
        viewHolder.fruitImage.setImageResource(fruit.getImageId());
        viewHolder.fruitName.setText(fruit.getName());
        /*second optimization*/
        //ImageView imageView = (ImageView)view.findViewById(R.id.fruit_image);
        //TextView textView = (TextView)view.findViewById(R.id.fruit_name);
        //imageView.setImageResource(fruit.getImageId());
        //textView.setText(fruit.getName());
        return view;
    }

    class ViewHolder {
        ImageView fruitImage;
        TextView fruitName;
    }
}
