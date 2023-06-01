package Interfaces;

public class CreditCard implements I_Charge{
    public void transactionApproval(double amount){
        System.out.println("connecting to the credit card company...");
        System.out.printf("A %,.2f$ transaction was aprroved!\n", amount);
    }
    @Override
    public void charge(double amount) {
        transactionApproval(amount);
    }

}
