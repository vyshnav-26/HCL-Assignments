public class GroceryProduct extends Product{
    double amount;
    double discount = 5.0;
    @Override
    public double calculateDiscount(){
        amount = (price * discount) / 100;
        return amount;
    }
    public GroceryProduct(int id,String name, double price){
        super(id,name,price);
    }
}
