package com.neu.viking.chapterone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Log.d("FirstActivity","Task id is "+getTaskId());
        //获取当前活动的名字
        //Log.d("FirstActivity",getClass().getSimpleName());
        setContentView(R.layout.first_layout);
        ActivityCollector.addActivity(this);
        Button button1 = (Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(FirstActivity.this,"You clicked Button 1.",Toast.LENGTH_SHORT).show();
                //显式Intent
                //Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                Intent intent = new Intent("com.neu.viking.androidtest.ACTION_START");
                //通过addCategory添加的需要提前在activity中添加好
                intent.addCategory("com.neu.viking.androidtest.MY_CATEGROY");
                //Intent intent = new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse("http://www.baidu.com"));
                //Intent intent = new Intent(Intent.ACTION_DIAL);
                //tel指定了协议
                //intent.setData(Uri.parse("tel:10086"));
                //String data = "Hello SecondActivity";
                //Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                //intent.putExtra("extra_data",data);
                //startActivity(intent);
                //Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                startActivity(intent);
                //startActivityForResult(intent,1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "You clicked Add.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked Remove.", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 1:
                if (RESULT_OK == resultCode) {
                    String returnnedData = data.getStringExtra("data_return");
                    Log.d("FirstActivity",returnnedData);
                }
        }
    }
}
