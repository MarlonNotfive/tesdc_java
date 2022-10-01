package com.day2;

import java.util.Scanner;

public class JavaProgram3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number1;
        int number2;
        int sum;
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter number 1:");
        number1 = sc.nextInt();

        System.out.println("Enter number 2:");
        number2 = sc.nextInt();

        sum = number1+number2;
        System.out.println("The total is "+sum);
        System.out.println("Bye "+name);
    }
}
