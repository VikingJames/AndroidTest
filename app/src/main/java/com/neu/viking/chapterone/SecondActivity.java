package com.neu.viking.chapterone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Log.d("SecondActivity","Task id is "+getTaskId());
        setContentView(R.layout.second_layout);
        ActivityCollector.addActivity(this);
        //获取从FirstActivity传过来的字符串
        //Intent intent = getIntent();
        //String data = intent.getStringExtra("extra_data");
        //Toast.makeText(SecondActivity.this,data,Toast.LENGTH_SHORT).show();
        Button button2 = (Button)findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //返回数据给其他活动
                //Intent intent = new Intent();
                //intent.putExtra("data_return","Hello FirstActivity");
                //setResult(RESULT_OK, intent);
                //finish();
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return","Hello FirstActivity from Back");
        setResult(RESULT_OK, intent);
        finish();
    }
}
