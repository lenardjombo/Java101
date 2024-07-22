public class RightShiftOperator {
    public static void main(String[] args)
    {
        int number = 8;
 
        // 2 bit left shift operation
        int Ans = number >> 2;
 
        System.out.println(Ans);
    }
}
//Right shift operator divides the number by 2^n
//example in the above program
//number is divided by 2^2 which is 4
//Thus Ans=number/4
//which is 2