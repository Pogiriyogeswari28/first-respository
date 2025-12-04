package com.jspiders.service;

import com.jspiders.Users.AdminServiceImp;

public class AdminServiceTests {

    public static void main(String[] args) {
        createMovieTest();
    }

    private static void createMovieTest() {
        System.out.println("Testing  Add  Movie");
        try{
            AdminServiceImp adminServiceImp = new AdminServiceImp();
            adminServiceImp.createMovie();
            System.out.println("Admin -create movie test passed");
        }
        catch(Exception ex){
            System.err.println("Admin -create movie test failed");
            ex.printStackTrace();
        }
    }
}
