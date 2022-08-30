package com.company;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
      myMethod();
      fibonacci1();
      notMyMethod();
    }
    static void myMethod(){
        //in this logic we are printing the fibonacci number up to num
        Scanner in = new Scanner(System.in);

        System.out.println("enter the number ");
        int num = in.nextInt();
        System.out.print(" 1 1 ");
        int a = 1;
        int b = 1;
        int k = 0;
        while(k<=num) {

            k = a + b;
            a = b;
            b = k;


                System.out.print(k + " ");


        }

    }
    static void fibonacci1(){
     //here we are finding the nth fibonacci number
        Scanner in = new Scanner(System.in);

        System.out.println("\r\n enter the number ");
        int num = in.nextInt();
      //  System.out.println("1 fibonacci number = 1 \r\n2 fibonacci number = 1");
        long a= 1L,b=1L,k;
        for(long i=1;i<=num;i++){
           if(i==1||i==2){
               System.out.println(i+" fibonacci number = "+1);
           }
           else {
               k = a + b;
               a = b;
               b = k;
               System.out.println(i + " fibonacci number = " + k);
           }
        }
    }
    static void notMyMethod(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number \r\n not my method : ");
        long n = in.nextLong();
        long a = 0L;
        long b = 1L;
        long count = 2;
        while(count<=n){
            long temp =b;
            b=b+a;
            a = temp;
            count++;

            System.out.print(b+" ");
        }


    }

}
