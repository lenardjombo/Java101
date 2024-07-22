public class Throw {
    //Function to validate if a person is eligble to vote or not 
        public static void validate(int age){
        if(age<18){
            //Throw an exception if a person is not able to vote
            throw new ArithmeticException("Person not eligible to vote!");
        }
        else{
            System.out.println("Person eligilbe to vote!");
        }
    }
    //main method
    public static void main(String[] args) {
        //calling the function
        validate(10);
        System.out.println("Execute the Rest of the code!");
}
    
}
