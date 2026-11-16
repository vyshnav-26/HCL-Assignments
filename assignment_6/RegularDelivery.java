public class RegularDelivery extends Delivery{
    double charge = 40.0;
    @Override 
    public double calculateDeliveryCharge(){
        return orderAmount + charge;
    }
    public RegularDelivery(double orderAmount){
        super(orderAmount);
    }
}

