public class LeftShiftOperator {
    public static void main(String[] args)
    {
        int number = 2;
 
        // 2 bit left shift operation
        int Ans = number << 2;
 
        System.out.println(Ans);
    }
}
//Left shift operator multiplies the number by 2^n
//example in the above program
//number is mutliplied by 2^2 which is 4
//Thus Ans=number*4
//which is 8