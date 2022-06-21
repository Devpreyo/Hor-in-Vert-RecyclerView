package com.example.horinvertrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CustomCategoryViewHolder> {

    ArrayList<Category> mCategories;
    Context mContext;
    LayoutInflater mInflater;

    public CategoryAdapter(ArrayList<Category> categories, Context context) {
        mCategories = categories;
        mContext = context;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public CustomCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        view = mInflater.inflate(R.layout.category, parent, false);
        return new CustomCategoryViewHolder(view);
        // return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomCategoryViewHolder holder, int position) {
        holder.rvSubcategoryList.setAdapter(new SubCategoryAdapter(mContext, mCategories.get(position).subCategories));
        holder.rvSubcategoryList.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
        holder.tvCategoryName.setText(mCategories.get(position).categoryName);
    }

    @Override
    public int getItemCount() {
        return mCategories.size();
    }

    public class CustomCategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvCategoryName;
        RecyclerView rvSubcategoryList;

        public CustomCategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            tvCategoryName = itemView.findViewById(R.id.tvMainCategoryName);
            rvSubcategoryList = itemView.findViewById(R.id.rvSubCategories);
        }
    }
}
