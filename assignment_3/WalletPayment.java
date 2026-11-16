public class WalletPayment implements Payment{
    @Override 
    public double calculateFee(double amount){
        double fee = (amount*1.0)/100;
        return fee;
    }
}