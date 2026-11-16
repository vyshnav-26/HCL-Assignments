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
        System.out.printf("Payment Amount: %.2f%n",amount);
        System.out.printf("Transaction Fee: %.2f%n",fee);
        System.out.printf("Final Amount: %.2f%n",(amount + fee));
    }
}