public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public double calculateFinalBalance(){
        return (balance + (balance * interestRate / 100));
    }
}