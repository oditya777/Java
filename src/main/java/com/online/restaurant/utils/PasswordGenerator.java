package com.online.restaurant.utils;

import java.util.Random;

public class PasswordGenerator {
    public  static String getPassword(){
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabets = alphabets.toLowerCase();
        String digits = "0123456789";
        String alphanumeric = alphabets + lowerAlphabets + digits;

        System.out.println(alphanumeric);

        Random random =new Random();
        String password ="";
        int randomIndex = random.nextInt(alphanumeric.length());
        char Character = alphanumeric.charAt(randomIndex);
        password = password + character;
        System.out.println("RANDOM Index" + randomIndex
        + "and Character"+ character);
    }
    System.out.print
    return pass;
}public static
