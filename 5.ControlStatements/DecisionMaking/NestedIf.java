public class NestedIf {
    public static void main(String[] args) {
        double temperature = 32.98;

        if(temperature < 40){
            System.out.println("Stay in the house ");
            if(temperature < 40 && temperature < 50){
                System.out.println("Don't Go for the swimmming");
            }
        }else{
            System.out.println("Stay outise to cool");
        }
    }
}
