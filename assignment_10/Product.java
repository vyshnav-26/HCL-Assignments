public class Product{
    int productId;
    String productName;
    double price;
    public Product(int id, String name, double price){
        this.productId = id;
        this.productName = name;
        this.price = price;
    }
    public double calculateDiscount(){
        return price;
    }
}