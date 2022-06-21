package com.example.horinvertrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ParentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<Object> items;

    private final int welcomeText = 1;
    private final int rvList = 0;


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return null;

        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        switch (viewType) {
            case welcomeText:
                View view = inflater.inflate(R.layout.welcome_view, parent, false);
                viewHolder = new WelcomeTextHolder(view);
                break;
            default:
                Toast.makeText(parent.getContext(), "Error in welcomed", Toast.LENGTH_SHORT).show();
                throw new IllegalStateException("Unexpected value: " + viewType);
        }

        return viewHolder;
    }

    @Override
    public int getItemViewType(int position) {
//        return super.getItemViewType(position);

        if (items.get(position) instanceof Category) {
            return rvList;
        } else if (items.get(position) instanceof WelcomeTextHolder) {
            return welcomeText;
        }
        return -1;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case welcomeText:
                //RecyclerView.ViewHolder viewHolder = holder;
                WelcomeTextHolder welcomeTextHolder = (WelcomeTextHolder) items.get(position);
                if (welcomeTextHolder != null) {
                    welcomeTextHolder.getTvWelcome().setText("Welcome !");
                    welcomeTextHolder.getTvWhat().setText("Get What check");
                }
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
