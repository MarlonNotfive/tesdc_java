package com.day3;

import java.util.Scanner;

public class JavaProgram5 {
    public static void main(String args[]){
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if ((age >= 0)&&(age <= 12)) {
            System.out.println("Child");
        } else if ((age >= 13)&&(age <= 17)) {
            System.out.println("Young Adult");
        } else if ((age >= 18)&&(age <= 59)) {
            System.out.println("Adult");
        } else if ((age >= 68)&&(age <= 100)) {
            System.out.println("Senior");
        } else {
            System.out.println("Invalid Age");
        }
        System.out.println("GoodBye!");
    }
}
