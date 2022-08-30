package com.company;

import java.util.Scanner;

public class NumberOccurrence {
    public static void main(String[]args){
      myMethod();

//        int num = 232/10;
//        int num2= 232%10;
//        System.out.println(num+" "+num2);

    }
    static void myMethod() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number ");
        long num = in.nextLong();
        System.out.println("value should be in less than 10");
        int value = in.nextInt();

        //how many times 7 is coming in the number
        int count = 0;
        if (value < 10) {
            while (num > 1) {

                long ans = num % 10;

                if (ans == value) {
                    count++;
                }
                num = num / 10;
            }
            System.out.println(count);

        }
        else{
            System.out.println("value is wrong");
        }
    }
}
