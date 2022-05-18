package com.example.movies_mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.Observer
import com.example.movies_mvvm.databinding.ActivityMainBinding
import com.example.movies_mvvm.viewmodel.MovieViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val model: MovieViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

        model.getMovieData().observe(this, Observer { movie ->
            binding.moviesImage.setImageDrawable(
                ResourcesCompat.getDrawable(resources, movie.img, applicationContext.theme)
            )
            binding.movieName.text = movie.name
            binding.moviesYear.text = movie.year.toString()
        })
    }
}