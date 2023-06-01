package Interfaces;

public class Account implements I_Charge {

    private double balance;
    public void getBalance(){
        System.out.printf("%,.2f$\n", balance);
    }
    public void depositToBalance(double amount){
        balance += amount;
    }

    public void withdrawalFromBalance(double amount){
        balance -= amount;
    }
    @Override
    public void charge(double amount) {
        balance -= amount;
    }
}
