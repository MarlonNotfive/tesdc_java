package com.activiesJavaShortCourse;

import java.util.Scanner;

public class Activity8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double length,width,perimeter, area;

        System.out.print("Enter Length: ");
        length = sc.nextDouble();
        System.out.print("Enter Width: ");
        width = sc.nextDouble();

        perimeter = calculatePerimeter(length, width);
        area = calculateArea(length, width);

        System.out.println("Perimeter is "+ String.format("%.2f",perimeter) +" meters");
        System.out.println("area is "+ String.format("%.2f",area) +" meters");
    }

    public static double calculatePerimeter(double l, double w){
        double p = (l+w)*2;
        return p;
    }

    public static double calculateArea(double l, double w){
        double a = l*w;
        return a;
    }
}
