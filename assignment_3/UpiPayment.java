public class UpiPayment implements Payment{
    @Override 
    public double calculateFee(double amount){
        double fee = (amount * 0.5)/100;
        return fee;
    }
}