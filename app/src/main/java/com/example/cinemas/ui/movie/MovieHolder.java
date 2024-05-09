package com.example.cinemas.ui.movie;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cinemas.R;

public class MovieHolder extends RecyclerView.ViewHolder {
    private ImageView img_homeCinemas;
    public MovieHolder(@NonNull View itemView) {
        super(itemView);
        img_homeCinemas = itemView.findViewById(R.id.img_homeCinemas);
    }
    public void bindData(final Movie movie) {
        img_homeCinemas.setImageResource(movie.getIdMovie());
    }
}
