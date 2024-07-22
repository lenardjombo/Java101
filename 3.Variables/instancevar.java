public class instancevar {
     // Declared Instance Variable
     public String name;
     public int i;
     public Integer I;
     public instancevar()
     {
         // Default Constructor
         // initializing Instance Variable
         this.name = "Leonard Mawia";
     }
  
     // Main Method
     public static void main(String[] args)
     {
         // Object Creation
         instancevar name = new instancevar();
  
         // Displaying O/P
         System.out.println("My  name is: " + name.name);
         System.out.println("Default value for int is "
                            + name.i);
        
         // toString() called internally
         System.out.println("Default value for Integer is "
                            + name.I);
     }
}
