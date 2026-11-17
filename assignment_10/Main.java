import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int option = s.nextInt();
        int id = s.nextInt();
        String name = s.next();
        double price = s.nextDouble();

        Product product;

        if(option == 1){
            product = new ElectronicsProduct(id,name,price);
        }
        else if(option == 2){
            product = new ClothingProduct(id ,name,price);
        }
        else{
            product = new GroceryProduct(id,name,price);
        }
        double discount = product.calculateDiscount();
        System.out.println("Product ID : "+id);
        System.out.println("Product Name : "+name);
        System.out.printf("Discount : %.2f%n",discount);
        System.out.printf("Final Price : %.2f",(price - discount));
    }
}