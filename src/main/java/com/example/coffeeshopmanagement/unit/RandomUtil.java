package com.example.coffeeshopmanagement.unit;

import java.util.Random;
public class RandomUtil {
    public static String random6Digits(){
        Random random = new Random();
        int number =  (100000 + random.nextInt(900000));
        return String.valueOf(number);
    }


}
