package com.example.cinemas.ui.movie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cinemas.R;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieHolder> {
    private Context context;
    private List<Movie> dataMovie;

    public MovieAdapter(Context context, List<Movie> dataMovie) {
        this.context = context;
        this.dataMovie = dataMovie;
    }

    @NonNull
    @Override
    public MovieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_home,parent,false);
        return new MovieHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieHolder holder, int position) {
        Movie movie = dataMovie.get(position);
        holder.bindData(movie);
    }

    @Override
    public int getItemCount() {
        if(dataMovie != null){
            return dataMovie.size();
        }
        return 0;
    }
}
