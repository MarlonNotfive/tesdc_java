public class JavaProgram2 {
    public static void main(String args[]){
        //arithmetic operators
        int num1 = 6;
        int num2 = 2;
        System.out.println("The sum is "+ (num1+num2));
        int difference = num1 - num2;
        System.out.println("The difference is "+ difference);
        System.out.println("The quotient is "+ (num1 / num2));
        System.out.println("The product is "+ (num1 * num2));
        System.out.println("The modulo is "+ (num1 % num2));
        //conditional operators
        System.out.println(num1 < num2);
        System.out.println(num1 > num2);
        System.out.println(num1 == num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        //logical operators
        System.out.println((num1 > num2)&&(num1 > num2)); //logical and both must be true
        System.out.println((num1 > num2)||(num1 < num2)); //logical or atleast 1 is true
        System.out.println(!(num1 > num2)); //logical Not or Inverter

    }
}
