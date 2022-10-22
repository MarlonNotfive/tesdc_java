package com.activiesJavaShortCourse;
import java.util.Scanner;
public class Activity4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name, remarks;
        Double gOne, gTwo, gThree, ave;

        System.out.println( "Average Grade      Grade Status\n" +
                            "100 - 95           President lister\n" +
                            "94 - 89            Dean lister\n" +
                            "88 - 83            Average Student\n" +
                            "82 - 78            Fair\n" +
                            "lower than 78      Failure\n" +
                            "more than 100      Invalid grade");

        System.out.println("\n");
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter grade in Physics: ");
        gOne = sc.nextDouble();
        System.out.print("Enter grade in Algebra: ");
        gTwo = sc.nextDouble();
        System.out.print("Enter grade in Programming: ");
        gThree = sc.nextDouble();
        System.out.println();
        ave = (gOne+gTwo+gThree) / 3;

        if ((ave<=100)&&(ave>=95)) {
            remarks = "President Lister";
            System.out.println(name+" average grade is "+String.format("%.2f",ave));
            System.out.println(remarks);

        } else if ((ave<=94)&&(ave>=89)) {
            remarks = "Dean Lister";
            System.out.println(name+" average grade is "+String.format("%.2f",ave));
            System.out.println(remarks);

        }  else if ((ave<=88)&&(ave>=83)) {
            remarks = "Average Student";
            System.out.println(name+" average grade is "+String.format("%.2f",ave));
            System.out.println(remarks);

        } else if ((ave<=82)&&(ave>=78)) {
            remarks = "Fair";
            System.out.println(name+" average grade is "+String.format("%.2f",ave));
            System.out.println(remarks);

        } else if (ave<78) {
            remarks = "Failure";
            System.out.println(name+" average grade is "+String.format("%.2f",ave));
            System.out.println(remarks);

        } else {
            System.out.println("Invalid Grade");
        }

    }
}
