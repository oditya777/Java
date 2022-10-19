package com.online.restaurant.utils;

import java.util.Random;

public class AddressGenerator {

    private static  String[] addresses = {
            "KR Pandav college, NEw nandanvan",
            "trillium vr, medical square",
    };
    public static String getAddress(){
        Random random = new Random();
        int randomIndex = random.nextInt(addresses.length);
        String address = addresses[randomIndex];
        System.out.println("Address=" + address);
        return  address;
    }
    public  static  void main(String[] args){
        AddressGenerator.getAddress();
    }
}
