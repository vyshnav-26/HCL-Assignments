import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int account_type = s.nextInt();
        int accountNumber = s.nextInt();
        double balance = s.nextDouble();
        BankAccount account;
        if(account_type == 1){
            double interestRate = s.nextDouble();
            account = new SavingsAccount(accountNumber,balance,interestRate);
        }
        else{
            double overdraftLimit = s.nextDouble();
            account = new CurrentAccount(accountNumber, balance, overdraftLimit);
        }

        System.out.printf("%.2f",account.calculateFinalBalance());
    }
}
