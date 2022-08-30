package com.company;
import java.util.Scanner;

import static java.lang.Character.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter the salary ");
        int salary = in.nextInt();
        int bonus;

        if(salary>5000){
            bonus=4000;
        }
        else {
            bonus = 3000;
        }

        int net = salary+bonus;
        System.out.println("his salary is : "+salary + " he got bonus "+ bonus +" his total salary now :"+net);

        int total= salary(12000);
        System.out.println("his total salary is "+total);

        largestNumber(10,1000,8);
        maximumNumber();
        maximumNumber2();
        mathMax(23,56,76);
        alphabet();
        alphabet2();

    }
    static int salary(int salary){
        if(salary>10000){
           return salary+=5000;
        }
        else{
          return   salary+=3000;
        }

    }
    static void largestNumber(int a,int b,int c){
       int largest;
       largest=a;
       if(a>b&&a>c){
           largest=a;}
      else if(b>a&&b>c){
           largest=b;
       }
       else {
           largest =c;
       }
        System.out.println(largest);




    }

    static void maximumNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first  value here ");
        int a = in.nextInt();
        System.out.println("enter the second value here ");
        int b = in.nextInt();
        System.out.println("enter the third value here ");
        int c = in.nextInt();

        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(" maximum number is: "+max);
    }

    static void maximumNumber2(){
        Scanner in = new Scanner (System.in);
        System.out.println("enter the first number ");
        int a = in.nextInt();
        System.out.println("enter the second number ");
        int b = in.nextInt();
        System.out.println("enter the next number ");
        int c = in.nextInt();

        int max = Math.max(c,Math.max(a,b));
//        if(max<c){
//           max = c;
//        }

        System.out.println(max);

    }
    static void mathMax(int a ,int b , int c){
       int max = Math.max( c,Math.max(a,b));
    }

    static void alphabet(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter any words here for checking the first letter is capital or not  ");
        char ch = in.next().trim().charAt(0);
        char ch1 = toUpperCase(ch);
        if(ch==ch1){
            System.out.println("character is in upper case ");
        }
        else {
            System.out.println("character is not in upper case");
        }

    }
    static void alphabet2(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the char ");
        char ch = in.next().trim().charAt(0);
        if(ch<='a'&&ch>='z'){
            System.out.println("lower case");
        }
        else{
            System.out.println("Upper case");
        }
    }

}
