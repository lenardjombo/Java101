public class Bank {
    //Attributes of the bank class
    String accountName;
    Double debitedAmount;
    Double creditedAmount;
    
    //constructor for the bank class
    public Bank(String accountName,Double debitedAmount,Double creditedAmount){
        this.accountName = accountName;
        this.creditedAmount = creditedAmount;
        this.debitedAmount = debitedAmount;
    }

    //method for the bank class
    //A method is a function defined within a class
    public void displayBankInfo(){
        System.out.println("AccountName: "+accountName);
        System.out.println("DebitedAmount: "+debitedAmount);
        System.out.println("CreditedAmount: "+creditedAmount);
    }

    public static void main(String[] args) {
        //Creating an object
        //An object is an instance of a class
        Bank BankInfo = new Bank("M-Pesa Foundation",200000.0392,23294.323);
        BankInfo.displayBankInfo();
    }
}
