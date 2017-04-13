package com.neu.viking.chaptertwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.neu.viking.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {

    private String[] data = {"Apple","Banana","Orange","Watermelon",
            "Pear","Grape","Pineappple","Strawberry","Cherry","Mango",
            "Apple","Banana","Orange","Watermelon", "Pear","Grape",
            "Pineappple","Strawberry","Cherry","Mango"};

    private List<Fruit>fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_layout);
        initFruit();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitRecyclerAdapter adapter = new FruitRecyclerAdapter(fruitList);
        recyclerView.setAdapter(adapter);
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
