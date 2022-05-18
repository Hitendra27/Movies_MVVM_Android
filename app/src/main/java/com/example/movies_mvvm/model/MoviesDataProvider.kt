package com.example.movies_mvvm.model

import com.example.movies_mvvm.R

class MoviesDataProvider {

    private val movies = arrayListOf<Movie>()

    init {
        movies.add(Movie("Inception", R.drawable.inception, 2010 ))
        movies.add(Movie("Back to the Future", R.drawable.back2thefuture, 1985))
        movies.add(Movie("Die Hard", R.drawable.diehard, 1988 ))
        movies.add(Movie("Fight Club", R.drawable.fightclub, 1999))
        movies.add(Movie("Goodfellas", R.drawable.goodfellas, 1990))
        movies.add(Movie("Star Wars", R.drawable.starwars, 1977 ))
        movies.add(Movie("Terminator 2", R.drawable.terminator2, 1991  ))
        movies.add(Movie("The GodFather", R.drawable.thegodfather, 1972))
        movies.add(Movie("The Matrix", R.drawable.thematrix, 1999))
        movies.add(Movie("The Shawshank Redemption", R.drawable.theshawshankredemption, 1994))
    }

    fun getMovies() = movies
}