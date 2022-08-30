package com.company;

import java.util.Scanner;

public class CalculatorProgram
{
    public static void main(String[]args){

      Scanner in = new Scanner(System.in);
      //take input from user till user does  not press X or x
        int ans =0;
        while(true){
            System.out.print("enter the operator: ");
            char op = in.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%'){
                System.out.println("enter the num1");
                int num1= in.nextInt();
                System.out.println("enter the num2");
                int num2=in.nextInt();
                if(op=='+'){
                     ans = num1+num2;
                }
                else if(op=='-'){
                     ans = num1-num2;

                }
                else if(op=='*'){
                     ans = num1*num2;
                    System.out.println(ans);
                }
                else if(op=='/'){
                    if(num2!=0) {
                        ans = num1 / num2;
                    }
                    else{
                        System.out.println("enter the right number");
                    }
                }
                else if(op == '%'){
                     ans = num1 % num2;
                }
                else{
                    System.out.println("enter the right operator");
                }

            }
            else if(op=='x'||op=='X'){
                break;
            }
            else{
                System.out.println("in valid operator");
            }
            System.out.println("your answer is "+ans+"\r\n if you want to stop the calculator please enter the x or X");
        }


    }
}
