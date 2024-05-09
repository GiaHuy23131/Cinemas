package com.example.cinemas;

import android.os.Bundle;

import com.example.cinemas.ui.movie.Movie;
import com.example.cinemas.ui.movie.MovieAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cinemas.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView revListMovie;
    MovieAdapter movieAdapter;
    ArrayList<Movie> arrMovie = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }
    private void setControl() {
        revListMovie = findViewById(R.id.revListMovie);
    }
    private void setEvent() {
        //khoi tao
        khoitao();
        revListMovie.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        movieAdapter = new MovieAdapter(this,arrMovie);
        revListMovie.setAdapter(movieAdapter);
    }

    private void khoitao() {
        arrMovie.add(new Movie(1,"2",R.drawable.ic_launcher_background));
    }


}