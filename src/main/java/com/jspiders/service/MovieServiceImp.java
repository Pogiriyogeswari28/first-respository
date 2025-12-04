package com.jspiders.service;

import com.jspiders.dto.MovieDto;
import com.jspiders.entity.MovieEntity;

import java.util.List;

public class MovieServiceImp  implements MovieService {


    @Override
    public void addMovie(MovieDto movieDto) {
        //convert moviedto to movie entity
        MovieEntity movieEntity = new MovieEntity();
        movieEntity.setTitle(movieDto.getTitle());
        movieEntity.setCertifaction(movieDto.getCertification());
        movieEntity.setLanguage(movieDto.getLanguage());
        movieEntity.setDuration(movieDto.getDuration());
        movieEntity.setStatus(movieDto.getStatus());




    }

    @Override
    public MovieEntity getMovie(Long movieId) {
        return null;
    }

    @Override
    public List<MovieEntity> getAllMovies() {
        return List.of();
    }
}
