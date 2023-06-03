package ClassAccesModifiers;

public class Bank {
    private final String CLIENT_NAME;
    private final int ACCOUNT_NUMBER;
    private double balance;

    public void depositToBalance(double amount){
        balance += amount;
    }

    public void withdrawalFromBalance(double amount){
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public Bank(String clientName, int accountNumber, double firstDeposit) {
        this.CLIENT_NAME = clientName;
        this.ACCOUNT_NUMBER = accountNumber;
        depositToBalance(firstDeposit);
    }
}
