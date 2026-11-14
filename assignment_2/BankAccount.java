
public class BankAccount{
    private int accountNumber;
    double balance;
    public BankAccount(int accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public double calculateFinalBalance(){
        return balance;
    }
}