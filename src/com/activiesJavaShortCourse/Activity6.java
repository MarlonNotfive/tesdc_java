package com.activiesJavaShortCourse;

import java.util.Arrays;
import java.util.Scanner;

public class Activity6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String display;
        int repeat;

        System.out.print("Enter String: ");
        display = sc.nextLine();
        System.out.print("Enter Number of Times: ");
        repeat = sc.nextInt();

        if(repeat>0){
            for (int i=0;i<repeat;i++){
                System.out.println(display);
            }

        }else {
            System.out.println("Invalid input, program ends");
        }


    }
}
