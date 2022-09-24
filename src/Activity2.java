import java.util.Scanner;

public class Activity2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double gradeOne, gradeTwo, gradeThree, total;
        double ave;

        System.out.println("Enter Grade in Math: ");
        gradeOne = sc.nextInt();
        System.out.println("Enter Grade in English: ");
        gradeTwo = sc.nextInt();
        System.out.println("Enter Grade in Filipino: ");
        gradeThree = sc.nextInt();

        total = gradeOne+gradeTwo+gradeThree;
        ave = total/3;

        System.out.println("Average Grade is: " + ave);

    }
}
