package com.day4;

import java.util.Scanner;

public class JavaProgram9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2: ");
        int num2 = sc.nextInt();

        System.out.println("The sum is " + add(num1, num2));
    }

    public static int add(int number1, int number2){
        int sum = number1 + number2;
        return sum;
    }
}
