import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int Payment_type = s.nextInt();
        double amount = s.nextDouble();
        Payment pay;
        if(Payment_type == 1){
            pay = new CreditCardPayment();
        }
        else if(Payment_type == 2){
            pay = new UpiPayment();
        }
        else{
            pay = new WalletPayment();
        }
        double fee = pay.calculateFee(amount);
        System.out.println("Payment Amount: "+amount);
        System.out.println("Transaction Fee: "+fee);
        System.out.println("Final Amount: "+(amount + fee));
    }
}