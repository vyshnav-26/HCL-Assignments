public class CreditCardPayment implements Payment{
    public double calculateFee(double amount){
        double fee = (amount * 2.0)/100;
        return fee;
    }
}