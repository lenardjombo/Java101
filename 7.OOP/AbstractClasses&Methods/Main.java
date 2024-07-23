abstract class MotorBike {
    abstract void brake();
  }
  
  class SportsBike extends MotorBike {
      
    // implementation of abstract method
    public void brake() {
      System.out.println("SportsBike Brake");
    }
  }
  
  class MountainBike extends MotorBike {
      
    // implementation of abstract method
    public void brake() {
      System.out.println("MountainBike Brake");
    }
  }
  
  class Main {
    public static void main(String[] args) {
      MountainBike m1 = new MountainBike();
      m1.brake();
      SportsBike s1 = new SportsBike();
      s1.brake();
    }
  }

//Abstract classes cannot be instantiated
//Abstract classes can have both regular and abstract methods
//Can also have constructors which can be accessed using the super keyword
//Abstraction is an important concept of object-oriented programming 
//that allows us to hide unnecessary details and only show the needed information.
//In the above implementation,te brake method() cannot be implemented inside MotorBike
//Every bike has its won implementation of brakes
//All subclasses of MotorBike will have different implementation of brake() method