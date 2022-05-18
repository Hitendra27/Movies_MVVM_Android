package com.example.movies_mvvm.viewmodel

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movies_mvvm.model.Movie
import com.example.movies_mvvm.model.MoviesDataProvider

class MovieViewModel: ViewModel() {

    private val movieData = MutableLiveData<Movie>()
    private val movies = MoviesDataProvider().getMovies()
    private var currentIndex = 0
    private val delay = 2000L

    init {
        loop()
    }

    fun getMovieData(): LiveData<Movie> = movieData

    private fun loop(){
        Handler(Looper.getMainLooper()).postDelayed({ updateMovie() },delay)
    }

    private fun updateMovie(){
        currentIndex++
        currentIndex %= movies.size

        movieData.value = movies[currentIndex]

        loop()
    }
}