package com.example.horinvertrecyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WelcomeTextHolder extends RecyclerView.ViewHolder {
    TextView tvWelcome, tvWhat;

    public WelcomeTextHolder(@NonNull View itemView) {
        super(itemView);
        tvWelcome = itemView.findViewById(R.id.tvWelcome);
        tvWhat = itemView.findViewById(R.id.tvWhatMind);
    }

    public TextView getTvWelcome() {
        return tvWelcome;
    }

    public void setTvWelcome(TextView tvWelcome) {
        this.tvWelcome = tvWelcome;
    }

    public TextView getTvWhat() {
        return tvWhat;
    }

    public void setTvWhat(TextView tvWhat) {
        this.tvWhat = tvWhat;
    }
}