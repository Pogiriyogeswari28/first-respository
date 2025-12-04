package com.jspiders.dao;

import com.jspiders.entity.MovieEntity;

import java.util.List;

public interface MovieDao {
    void getMovie(MovieEntity movieEntity);
    void getAllMovies(long movie_id);
    List<MovieEntity> getAllMovies();
}
