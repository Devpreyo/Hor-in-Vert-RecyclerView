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

        categories = prepareData();

        categoryAdapter = new CategoryAdapter(categories, MainActivity.this);
        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
        rvCategory.setLayoutManager(manager);
        rvCategory.setAdapter(categoryAdapter);
    }

    private ArrayList<Category> prepareData() {
        ArrayList<Category> categories = new ArrayList<>();

        Category topBrands = new Category();
        topBrands.id = 1;
        topBrands.categoryName = "Top Brands";
        topBrands.subCategories = new ArrayList<SubCategory>();

        SubCategory subCategory = new SubCategory();
        subCategory.id = 1;
        subCategory.subCategoryName = "Denim";
        subCategory.subCategoryImgUrl = "https://d3ulwu8fab47va.cloudfront.net/skin/frontend/default/ubuycom-v1/images/home-category-icons/electronics.png";

        SubCategory subCategory2 = new SubCategory();
        subCategory2.id = 2;
        subCategory2.subCategoryName = "Java";
        subCategory2.subCategoryImgUrl = "https://d3ulwu8fab47va.cloudfront.net/skin/frontend/default/ubuycom-v1/images/home-category-icons/electronics.png";


        topBrands.subCategories.add(subCategory);
        topBrands.subCategories.add(subCategory2);

        categories.add(topBrands);

        return categories;
    }


}