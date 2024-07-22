//                  Classes in java
//A class is a blueprint or template for creating objects
//Classes define a data type by combining the attributes and
// methods (Functions within a class) that operate on the data
    //A constructor has the same name as the class
    //Constructors do not have a return type void included
    //1.Default constructors do not have initialization
    //2.Parameterized constructor==Allows initialization
    // attributes with specific values  when creating an object
    /*example of default constructor
    The class should be named as person
    public person(){
    no initialization
    }
    example2-parameterised constructor
    public person(String name){
    no initialization
    }
     */
public class Car {
    //Attributes
    String color;
    String model;
    int year;

    //Constructor==used to initialize objects within a class
    public    Car(String color,String model,int year){ //Cnstructor==same name as the class Car
        this.color = color;
        this.model = model;
        this.year = year;
    }
    //method to display the car details
    public void displayDetails(){
        System.out.println("Color: "+color);
        System.out.println("Model: "+model);
        System.out.println("Year: "+year);
    }
    public static void main(String[] args) {
        //creating an object within the constructor
        Car car1 = new Car("Fawn", "AudiQ8", 2022);
        //Calling the method to display car details
        car1.displayDetails();
    }
}
