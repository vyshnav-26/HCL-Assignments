public class ExpressDelivery extends Delivery{
    double charge = 80.0;
    @Override 
    public double calculateDeliveryCharge(){
        return orderAmount + charge + (orderAmount * 5) / 100;
    }
    public ExpressDelivery(double orderAmount){
        super(orderAmount);
    }
}