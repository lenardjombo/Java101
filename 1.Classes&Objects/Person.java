public class Person {
    //Attributes of a Person class
    String name;
    int age;
    Double height;

    //constructor to initialize objects within the class person
    public Person(String name,int age,Double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    //method to display Person's details
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
    }
    public static void main(String[] args) {
        //creating an object within the constructor
        Person Person1 = new Person("name",45,200.42);
        //calling the method/Function to display person's info
        Person1.displayInfo();
    }
}
