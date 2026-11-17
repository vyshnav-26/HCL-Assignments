
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int option = s.nextInt();
        double orderAmount = s.nextDouble();
        Delivery delivery;
        if(option == 1){
            delivery = new RegularDelivery(orderAmount); 
        }
        else{
            delivery = new ExpressDelivery(orderAmount);
        }
        System.out.printf("%.2f",delivery.calculateDeliveryCharge());
    }
}