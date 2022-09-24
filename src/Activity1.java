import java.util.Scanner;

public class Activity1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String fname,lname,mi;

        System.out.println("Enter Your First Name: ");
        fname = sc.nextLine();
        System.out.println("Enter your Middle Name: ");
        mi = sc.nextLine();
        System.out.println("Enter your Last Name: ");
        lname = sc.nextLine();
        System.out.println();
        System.out.println("Your Name is "+fname+" "+mi+". "+lname);
    }
}
