package com.activiesJavaShortCourse;
import java.util.Scanner;
public class Activity3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String prodName;
        double prodPrice, discount;
        discount = 0;

        System.out.print("Price range       Discount\n" +
                "0 - 10,000             0%\n" +
                "10,001 - 20,000        5%\n" +
                "20,001 - 50,000        10%\n" +
                "50,001 - 100,000       15%\n" +
                "Greater than 100,000   20%\n\n");

        System.out.print("Enter Product: ");
        prodName = sc.nextLine();
        System.out.print("Enter Price: ");
        prodPrice = sc.nextDouble();

        if ((prodPrice >= 0) && (prodPrice <= 10000)) {
            System.out.println("Prince of " + prodName + " is " + String.format("%.2f",prodPrice));
            System.out.println("Discount is " + String.format("%.2f",discount));
            System.out.println("Net Price is " + String.format("%.2f",(prodPrice - discount)));

        } else if ((prodPrice >= 10001) && (prodPrice <= 20000)) {
            discount = prodPrice * 0.05;
            System.out.println("Prince of " + prodName + " is " + String.format("%.2f",prodPrice));
            System.out.println("Discount is " + String.format("%.2f",discount));
            System.out.println("Net Price is " + String.format("%.2f",(prodPrice - discount)));

        } else if ((prodPrice >= 20001) && (prodPrice <= 50000)) {
            discount = prodPrice * 0.10;
            System.out.println("Prince of " + prodName + " is " + String.format("%.2f",prodPrice));
            System.out.println("Discount is " + String.format("%.2f",discount));
            System.out.println("Net Price is " + String.format("%.2f",(prodPrice - discount)));

        } else if ((prodPrice >= 50001) && (prodPrice <= 100000)) {
            discount = prodPrice * 0.15;
            System.out.println("Prince of " + prodName + " is " + String.format("%.2f",prodPrice));
            System.out.println("Discount is " + String.format("%.2f",discount));
            System.out.println("Net Price is " + String.format("%.2f",(prodPrice - discount)));

        } else if (prodPrice>100000) {
            discount = prodPrice * 0.20;
            System.out.println("Prince of " + prodName + " is " + String.format("%.2f",prodPrice));
            System.out.println("Discount is " + String.format("%.2f",discount));
            System.out.println("Net Price is " + String.format("%.2f",(prodPrice - discount)));

        } else {
            System.out.println("ERROR: Invalid Price");
        }
    }
}
