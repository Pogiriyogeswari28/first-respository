package com.jspiders.config.dao;

import com.jspiders.config.DBConfig;
import com.jspiders.entity.MovieEntity;

public class MovieDaoTests {
    public void getMovie( int MoviefId) {

    }
    public static void main(String[] args) {
        testDbConnection();




    }
    public static void testDbConnection(){
        System.out.println("testing DbConnection");
        try{
            DBConfig.getSession();
            DBConfig.shutdown();
            System.out.println("test db passed");
        }
        catch (Exception ex){
            System.out.println("test db failed");
        }
    }
}
