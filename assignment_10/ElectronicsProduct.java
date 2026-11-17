public class ElectronicsProduct extends Product{
    double amount;
    double discount = 12.0;
    public double calculateDiscount(){
        amount = (price * discount)/100;
        return amount;
    }
    public ElectronicsProduct(int id,String name, double price){
        super(id,name,price);
    }
}