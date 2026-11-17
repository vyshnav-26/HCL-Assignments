public class ClothingProduct extends Product{
    double amount;
    double discount = 20.0;
    public double calculateDiscount(){
        amount = (price * discount)/100;
        return amount;
    }
    public ClothingProduct(int id,String name, double price){
        super(id,name,price);
    }
}