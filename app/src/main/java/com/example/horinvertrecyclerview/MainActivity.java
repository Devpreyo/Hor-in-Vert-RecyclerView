package com.example.horinvertrecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvCategory;
    private CategoryAdapter categoryAdapter;
    private ArrayList<Category> categories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rvCategories);

//        ArrayList<Object> items = new ArrayList<>();
//        items.add(new Welcome("Welcome !", "What's on Mind!"));
//
//        MultiViewAdapter multiViewAdapter = new MultiViewAdapter();
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
//        rvCategory.setLayoutManager(linearLayoutManager);
//        rvCategory.setAdapter(multiViewAdapter);


        Category category = new Category();

        categoryAdapter = new CategoryAdapter(category.prepareData(), MainActivity.this);
        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
        rvCategory.setLayoutManager(manager);
        rvCategory.setAdapter(categoryAdapter);
    }
}