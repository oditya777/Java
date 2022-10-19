package com.online.restaurant.utils;

import java.util.Random;

public class OTPGenrator {
    final static int Max = 999999;
    final  static int MiN = 100000;
   static Random  random = new Random();
    public static int getOTP(){
        Random random = new Random();

        int number = random.nextInt(Max- MiN);
        int otp = MiN + number;
        System.out.println("OTP Number" + otp);
        return  otp;

    }
    public static void main(String[] args) {
        for (int i =0 ;i < ;100; i++){
            OTPGenrator.getOTP();
        }

    }
}

