public class CurrentAccount extends BankAccount{
    double overdraftLimit;
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit){
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override 
    public double calculateFinalBalance(){
        return (balance + overdraftLimit);
    }
}