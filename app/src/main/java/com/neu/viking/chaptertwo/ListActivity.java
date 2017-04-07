package com.neu.viking.chaptertwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.neu.viking.R;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private String[] data = {"Apple","Banana","Orange","Watermelon",
            "Pear","Grape","Pineappple","Strawberry","Cherry","Mango",
            "Apple","Banana","Orange","Watermelon", "Pear","Grape",
            "Pineappple","Strawberry","Cherry","Mango"};

    private List<Fruit>fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        initFruit();
        //ArrayAdapter<String>adapter = new ArrayAdapter<String>(ListActivity.this,android.R.layout.simple_list_item_1,data);
        FruitAdapter fruitAdapter = new FruitAdapter(ListActivity.this, R.layout.fruit_item, fruitList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(fruitAdapter);
    }

    private void initFruit() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < data.length; j++) {
                Fruit fruit = new Fruit(data[j], R.drawable.img_1);
                fruitList.add(fruit);
            }
        }
    }
}
