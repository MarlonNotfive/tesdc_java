package com.day3;

import java.util.Scanner;

public class JavaProgram9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int number = 1;

        while(number > 0){
            System.out.println("Enter a number[enter a (-) value to exit");
            number = sc.nextInt();
            if(number < 0){
                System.out.println("Exiting");
            }else {
                result = result + number;
                System.out.println(result);
            }
        }
        System.out.println("Bye!");
    }
}
