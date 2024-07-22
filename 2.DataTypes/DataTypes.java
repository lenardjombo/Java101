public class DataTypes {
    public static void main(String[] args) {
        //There are two data types in java
        /*
        1.Primitive Data Types
        A primitive data type specifies the size and type of variable values
        A primitive type starts with a lowercase letter
        Examples:
            -boolean, 
            -char, 
            -int, 
            -short, 
            -byte, 
            -long, 
            -float, 
            -double
        2.Non-Primitive Data Types 
        Non-primitive data types are called reference types because they refer to objects
        Non-primitive types starts with an uppercase letter.
        Examples:
            -String,
            -Array
         */
        boolean Boolean1= true;
        char char1 = '@';
        int age = 20;
        short ShortNumber = 23324;
        long LongNumber = 1231431414141414L;
        float FloatNumber = 3.1427f;
        double DoubleNumber = 1232.21;

        String NickName = "John Mapesa";
        String[] names = {"John","Terry","Mapesa","Kalume"};
        System.out.println("This is a Boolean Value: "+Boolean1);
        System.out.println("This is a char value: "+char1);
        System.out.println("This is  an integer value: "+age);
        System.out.println("This is a short dataType: "+ShortNumber);
        System.out.println("This is a longint DataType"+LongNumber);
        System.out.println("This is a Float Datatype: "+FloatNumber);
        System.out.println("This is a  Double Datatype: "+DoubleNumber);
        System.out.println("This is a string datatype: "+NickName);
        System.out.println("\n");
        System.out.println("Array");
        for(int i = 0; i< names.length;i++){
            System.out.println(names[i]);
        }
    }
}
