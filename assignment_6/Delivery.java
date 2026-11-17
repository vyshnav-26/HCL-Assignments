
public class Delivery{

    double orderAmount;

    public Delivery(double orderAmount) {
        this.orderAmount = orderAmount;
    }
    
    double calculateDeliveryCharge(){
        return orderAmount;
    }
}