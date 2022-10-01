package com.day3;

public class JavaProgram3 {
    public static void main(String args[]){
        int age = 20;
        if(age < 12) {
            System.out.println("Child");
        } else if(age < 18){
            System.out.println("Young adult");
        } else {
            System.out.println("Adult");
        }
        System.out.println("Goodbye!");
    }
}
