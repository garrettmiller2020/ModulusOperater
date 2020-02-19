package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {testOddness();}

    public static void testOddness() {
       Scanner Keyboard;
       Keyboard = new Scanner(System.in);
       System.out.println("Enter positive number");
       int number = Keyboard.nextInt();
       System.out.println("Number is even: " + (number % 2 ==0));
       System.out.println("Number is odd: " + (number % 2 !=0));


    }
}
