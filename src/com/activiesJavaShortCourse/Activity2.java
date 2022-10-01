package com.activiesJavaShortCourse;

import java.util.Scanner;

public class Activity2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double gradeOne, gradeTwo, gradeThree, total;
        double ave;

        System.out.println("Enter Grade in Math: ");
        gradeOne = sc.nextDouble();
        System.out.println("Enter Grade in English: ");
        gradeTwo = sc.nextDouble();
        System.out.println("Enter Grade in Filipino: ");
        gradeThree = sc.nextDouble();

        total = gradeOne+gradeTwo+gradeThree;
        ave = total/3;

        System.out.println("Average Grade is: " + ave);
        //System.out.println("Average Grade is: " + String.format("%.2f",ave));

    }
}
