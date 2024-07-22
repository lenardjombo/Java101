import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        int num1;
        int num2;
        int addition;
        int subtraction;
        double division;
        int multiplication;
        double modulus;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1: ");
        num1 = scanner.nextInt();
        System.out.println("Enter num2: ");
        num2 = scanner.nextInt();
        addition = num1+num2;
        subtraction = num1 - num2;
        division = num1/num2;
        multiplication = num1*num2;
        modulus = num1%num2;
        System.out.println("The addition of "+num1+ " & "+num2+" is "+addition);
        System.out.println("The subtraction "+num1+ " & "+num2+" is "+subtraction);
        System.out.println("The division "+num1+ " & "+num2+" is "+division);
        System.out.println("The multiplication "+num1+ " & "+num2+" is "+multiplication);
        System.out.println("The modulus "+num1+ " & "+num2+" is "+modulus);
        scanner.close();

    }
}
//Basic implementation of arithmetic operations in java