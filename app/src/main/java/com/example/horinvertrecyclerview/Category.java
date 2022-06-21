package com.example.horinvertrecyclerview;

import java.util.ArrayList;

public class Category {
    public int id;
    public String categoryName;
    ArrayList<SubCategory> subCategories;

    public ArrayList<Category> prepareData() {
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

        Category superSale = new Category();
        superSale.id = 2;
        superSale.categoryName = "SuperSale";
        superSale.subCategories = new ArrayList<SubCategory>();

        SubCategory subCategory11 = new SubCategory();
        subCategory11.id = 1;
        subCategory11.subCategoryName = "Roy";
        subCategory11.subCategoryImgUrl = "https://d3ulwu8fab47va.cloudfront.net/skin/frontend/default/ubuycom-v1/images/home-category-icons/electronics.png";

        SubCategory subCategory12 = new SubCategory();
        subCategory12.id = 2;
        subCategory12.subCategoryName = "PY";
        subCategory12.subCategoryImgUrl = "https://d3ulwu8fab47va.cloudfront.net/skin/frontend/default/ubuycom-v1/images/home-category-icons/electronics.png";


        superSale.subCategories.add(subCategory11);
        superSale.subCategories.add(subCategory12);

        categories.add(topBrands);
        categories.add(superSale);

        return categories;
    }
}
