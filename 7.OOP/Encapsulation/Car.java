//Encapsulation ->Attributes of a class are hidden or private
//They can only be accessed through methods (Getters and setters)

public class Car {
    //Private attributes of the class Car
    private String make;
    private String model;
    private int year;

    //Constructor for class Car
    Car(String make,String model,int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }
    //Method to access make attribute
    public String getMake(){
        return make;
    }
    //Method to access Model attribute
    public String getModel(){
        return model;
    }
    //Method to access Year attribute
    public int getYear(){
        return year;
    }
    //setter method to change make attributes
    public void setMake(String make){
        this.make = make;
    }
    //setter method to change model attribute
    public void setModel(String model){
        this.model = model;
    }
    //setter method to change year attribute
    public void setYear(int year){
        this.year = year;
    }
    public static void main(String[] args) {
        //Instance of Car Class
        Car car = new Car("Audi ","Audi Q5",2023);
        car.setMake("Bmw");
        System.out.println(car.getMake());
        }
}

