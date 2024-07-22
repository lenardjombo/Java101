import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        //basic calculator to implement switch statements
        int num1;
        int num2;
        double result;
        String  operator;
        
        Scanner scanner = new Scanner(System.in);
        //Operation to be performed
        System.out.println("Enter operation to be performed: ");
        operator = scanner.nextLine();
        //Taking first input from user
        System.out.println("Enter Num1: ");
        num1 = scanner.nextInt();
        //Taking second input from user
        System.out.println("Enter Num2: ");
        num2 = scanner.nextInt();

        //Switch statements
        switch(operator){
            case("+"):
            result = num1+num2;
            System.out.println("The summation of "+num1+" and "+num2+" is "+result);
            break;
            case("-"):
            result = num1-num2;
            System.out.println("The subtraction of "+num1+" and "+num2+" is "+result);
            break;
            case("*"):
            result = num1+num2;
            System.out.println("The Multiplication of "+num1+" and "+num2+" is "+result);
            break;
            case("/"):
            result = num1/num2;
            System.out.println("The Division of "+num1+" and "+num2+" is "+result);
            break;
            default:
            System.out.println("Error 404!Operation Not Found!!");
            System.out.println("Try +,-,* or /");
        }
        scanner.close();
    }
}