package com.mycompany.app.Tuan1;

import java.util.Random;

public class Ex2 {
    public static void main (String[] args) {
        Random random = new Random();      
        int secondValue = random.nextInt(100);
        System.out.println("Giá trị thứ hai: " + secondValue);
        for (int i = 0; i < 25; i++) {
            int value = random.nextInt(100); 

            if (value > secondValue) {
                System.out.println(value + " > " + secondValue);
            } else if (value < secondValue) {
                System.out.println(value + " < " + secondValue);
            } else {
                System.out.println(value + " = " + secondValue);
            }
        }
    }
}
