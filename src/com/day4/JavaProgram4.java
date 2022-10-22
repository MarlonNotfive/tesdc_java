package com.day4;

import java.util.Scanner;

public class JavaProgram4 {
    public static void main(String args[]){
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        //traverse input via loop
        int ctr = 0;
        while(ctr<numbers.length){
            System.out.println("Enter number "+(ctr+1));
            numbers[ctr] = sc.nextInt();
            ctr++;
        }

        //traverse output
        System.out.println("numbers are...");
        ctr = 0;
        while(ctr < numbers.length){
            System.out.println(numbers[ctr]);
            ctr++;
        }
    }
}
