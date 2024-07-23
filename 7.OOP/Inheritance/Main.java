package Inheritance;
class Animal {

    // method in the superclass
    public void eat() {
      System.out.println("I can eat");
    }
  }
  
  // Dog inherits Animal
  class Dog extends Animal {
  
    // overriding the eat() method
    @Override
    public void eat() {
  
      // call method of superclass
      super.eat();
      System.out.println("I eat dog food");
    }
  
    // new method in subclass
    public void bark() {
      System.out.println("I can bark");
    }
  }
  
  class Main {
    public static void main(String[] args) {
  
      // create an object of the subclass
      Dog labrador = new Dog();
  
      // call the eat() method
      labrador.eat();
      labrador.bark();
    }
  }
//Method overriding in Java Inheritance
//Method inside the derived class overrides method inside the base class
//super keyword ->used when the same method in the subclass overrides method in the superclass
//In such a situation ,the super keyword is used to call the methodof the parent class from the method of the child class
//protected methods and fields can be accessed by the subclass of the class
//Inheritance elps with code reusability
//method overriding is also known as runtime polymorphism