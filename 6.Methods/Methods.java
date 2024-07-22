public class Methods{
    //Attributes
    String name;
    //Constructor
    public Methods(String name){
        this.name = name;
    }
    //method
    void String(){
        System.out.println("Hello "+name);
    }
    public static void main(String[] args) {
        Methods method = new Methods("jombo");
        method.String();
    }
}
    //A method is like a function declared within a certain class
    //Methods expose the behaviour of an object
    //A method is also a set of codes that perform a specific task
    //Methods allows for code reusability and optimization
    //There are two categories of methods according to their creation
    //1.Instance method-Access the instance data using object name
    //2.Static method-Access the static data using class name
   
