package com.activiesJavaShortCourse;

import java.util.Scanner;

public class Activity7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] athlete = new String[5];
        double[] sales = new double[5];
        double totalSales = 0;

        System.out.println();
        System.out.println("TOP 5 ATHLETE'S NAME AND SALES");

        //declare inputs
        for(int i = 0; i<athlete.length; i++) {
            System.out.print("Enter athlete " + (i+1) +": ");
            athlete[i] = sc.next();
            System.out.print("Enter sales: ");
            sales[i] = sc.nextDouble();
            totalSales = totalSales+sales[i];
        }

        //display outputs
        System.out.println();
        System.out.println("Top SportsMan");
        System.out.println("Name                   Sales\n" +
                           "===================================");

        for(int i=0; i<athlete.length; i++){
            System.out.println(athlete[i] + space(athlete[i]) + String.format("$%,3.2f",sales[i]));
        }

        System.out.println("===================================");
        System.out.println("Total "+String.format("$%,3.2f",totalSales));
        System.exit(0);
    }

    public static String space(String name){    //para pantay yung spacing

        String returnSpacing = "";
        int needSpace = 24;
        int ctr = needSpace-name.length();

        for (int i=0; i<ctr; i++) {
            returnSpacing = returnSpacing + " ";
        }
        return returnSpacing;
    }
}
