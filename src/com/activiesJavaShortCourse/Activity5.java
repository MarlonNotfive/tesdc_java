package com.activiesJavaShortCourse;
import java.util.Scanner;
public class Activity5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int wNumber, eNumber, ans;

        System.out.print("Enter Number: ");
        wNumber = sc.nextInt();
        System.out.print("Enter Exponent: ");
        eNumber = sc.nextInt();
        ans = wNumber;

        for(int i=0; i<eNumber-1; i++ ) {
            ans = ans * wNumber;
        }

        System.out.println(wNumber+" raised to "+eNumber+" is "+ans);

    }
}
