/*
 *************************Exception Handling in Java****************************
Exception-It is an event that disrupts the normal flow of the program
It is an object which is thrown at runtime
ExceptionHandling-A mechanism to handle runtime errors e.gSQLException

********************Advantages of Exception Handling****************************
Maintaining the normal flow of the 

****************************Types of java Exceptions****************************
1.Checked Exception ->The classes directly inherit the Throwable class except Runtime Exception
They are checked at compile-time
Examples-
        1.IOException
        2.SQLException

2.Unchecked Exception ->The classes that inherit the RunTimeException are known as unchecked exceptions
Examples-
        1.ArithmeticException
        2.NullPointerException
        3.ArrayIndexOutOfBoundException
3.Error-Irrecovable
Examples-
        1.OutOfMemoryError
        2.VirualMachineError
        3.AssertionError

********************Java EXception Key Words*****************************************
1.try->Used to specify a block of code where we should place an exception code.
try block must be followed by either catch or finally

2.catch->Used to handle exception
It must be preceded by catch 
It can be followed by finally block later

3.finally->Used to execute the necessary code of the program

4.throw->Used to throw an exception

5.throw->Used to declare exceptions
It specifies that there may occur an exception in the method
It doesn't throw an exception
It is always used with method signature
 */

 //example
 public class ExceptionHandling{
    public static void main(String[] args) {
        try{
            //code that may raise exception
            int data = 100/0;
            System.out.println(data);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Data could not be divided");
    }

 }