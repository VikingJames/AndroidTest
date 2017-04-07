package com.neu.viking.chaptertwo;

import android.app.Activity;
import android.content.Context;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.neu.viking.R;

/**
 * 为自定义的布局实现点击事件
 * Created by Administrator on 2017/4/7.
 */

public class TitleLayout extends LinearLayout {

    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title_layout, this);
        Button titleBack = (Button)findViewById(R.id.title_back);
        Button titleEdit = (Button)findViewById(R.id.title_edit);
        titleBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
        titleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "You clicked Edit Button.",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
