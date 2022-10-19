package com.online.restaurant.utils;

import java.util.Random;

public class PhoneNumberGenrator {
    final static int Max = 9999999999;
    final  static int MiN = 100000000;
   static Random  random = new Random();
    public static int getPhoneNumber(){
        Random random = new Random();

        int number = random.nextInt(Max- MiN);
        int PhoneNumber = MiN + number;
        System.out.println("Phone Number" + );
        return  PhoneNumber;

    }
    public static void main(String[] args) {
        for (int i =0 ;i < ;100; i++){
            PhoneNumberGenrator.getPhoneNumber();
        }

    }
}

