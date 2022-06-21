package com.example.horinvertrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SubCategoryAdapter extends RecyclerView.Adapter<SubCategoryAdapter.CustomViewHolder> {

    Context mContext;
    ArrayList<SubCategory> mSubCategories;
    LayoutInflater mInflater;

    public SubCategoryAdapter(Context context, ArrayList<SubCategory> subCategories) {
        mContext = context;
        mSubCategories = subCategories;
        mInflater = LayoutInflater.from(context);
    }


    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = mInflater.inflate(R.layout.sub_category, parent, false);
        return new CustomViewHolder(view);
//        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        SubCategory subCategory = mSubCategories.get(position);
        holder.tvSubCategoryName.setText(subCategory.subCategoryName);
        Picasso.get().load(subCategory.subCategoryImgUrl).into(holder.ivSubCategoryImage);
    }

    @Override
    public int getItemCount() {
        return mSubCategories.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView ivSubCategoryImage;
        TextView tvSubCategoryName;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            ivSubCategoryImage = itemView.findViewById(R.id.ivCategoryImg);
            tvSubCategoryName = itemView.findViewById(R.id.tvCategoryName);
        }
    }
}
