package com.jspiders;

import com.jspiders.Users.AdminServiceImp;

import java.util.Scanner;

public class TicketPlusApplication {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("select the user type"+
                "\n1️⃣ Admin"+
                "\n2️⃣ Customer"+
                "\n3️⃣ Exit");
        Integer user=sc.nextInt();
       switch (user){
           case 1:System.out.println(
                   "1️⃣ Add movie\n"+
                           "2️⃣ Create Show\n" +
                           "3️⃣ Exit");
               AdminServiceImp adminService=new AdminServiceImp();
               Integer choice=sc.nextInt();


               switch (choice){
                   case 1:
                       adminService.createMovie();
                   case 2:{
                       System.out.println("create show");
                   }
                   default:break;
               }
               break;
               case 2:{
                   System.out.println("customer");
                   break;
               }
               default:System.exit(0);
       }
    }
}
