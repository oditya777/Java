package com.online.restaurant.utils;

import java.util.Random;

public class OTPGenerator {
    final static int Max = 999999;
    final  static int MiN = 100000;
   static Random  random = new Random();
    public static int getOTP(){
        int number = random.nextInt(Max - MiN); // 899999
        int otp = MiN + number; // 100000 + 22345 = 122345
              System.out.println(" OTP Number = " + otp);
        return otp;
    }
    public static void main(String[] args) {
        for(int i =0; i < 100; i++) {
            OTPGenerator.getOTP();
        }
    }
}

