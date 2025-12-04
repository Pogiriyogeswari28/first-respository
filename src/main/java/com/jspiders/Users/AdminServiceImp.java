package com.jspiders.Users;

import com.jspiders.dto.MovieDto;
import com.jspiders.enums.MovieStatus;
import com.jspiders.service.MovieServiceImp;

import java.util.Scanner;

public class AdminServiceImp  implements AdminService {
    public void createMovie(){
        try{
            MovieServiceImp movieServiceImp = new MovieServiceImp();
            Scanner sc = new Scanner(System.in);
            MovieDto movieDto = new MovieDto();

            System.out.println("Enter title : ");
            String title = sc.nextLine();
            movieDto.setTitle("movie -1");

            System.out.println("Enter certification : ");
            String certification = sc.nextLine();
            movieDto.setCertification("u");

            System.out.println("Enter language : ");
            String language = sc.nextLine();
            movieDto.setLanguage("English");

            System.out.println("Enter duration : ");
            String duration = sc.nextLine();
            movieDto.setDuration(120);

            movieDto.setCreatedBy(302L);
            movieDto.setStatus(MovieStatus.AVAILABLE);


            System.out.println("=====verify movie details=====");
            System.out.println(movieDto);
            movieServiceImp.addMovie(movieDto);
            System.out.println("=====verify movie details=====");
            System.out.println("movie added successfully");

        } catch (Exception ex) {
            System.err.println("movie failed to add");
            ex.printStackTrace();

        }
    }

}
