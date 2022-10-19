package com.online.restaurant.utils;

import java.util.Random;

public class EmailIDGEnerator {


    private  static  final String EMAIL_SUFFIX = "@gmail.com";
    private  static  final Random random = new Random();
    private  static  final  int MIN = 2000;
    private  static  final int MAX = 2022;
    public  static  String getEmailID(String name){
        int randomNumber = random.nextInt(MAX -MIN);
        int year = MIN + randomNumber;
        String emailID = name + year + EMAIL_SUFFIX;
        System.out.println("EmailID :"+ emailID);
        return emailID;
    }
    public static void main ()
}


