package com.company;

import java.util.Scanner;

public class ReverseOfAnyNumber
{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        while(num>0){
            int rem=num%10;
            System.out.print(rem);
            num = num/10;
        }
        System.out.println();
        notMyMethod();
    }
    static void notMyMethod(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int num = in.nextInt();
        int ans =0;

        while(num>0){
            int rem = num%10;
            num /= 10;
            ans = ans*10+rem;

        }
        System.out.println(ans);
    }
}
