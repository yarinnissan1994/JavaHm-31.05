package Arrays;

public class BaseProduct {
    protected String name;
    protected String description;
    protected double price;

    public BaseProduct(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void printDetails(){
        System.out.println("Product name: "+ name);
        System.out.println("Product description: "+ description);
        System.out.printf("Price: %,.2f$", price);
    }

    public static void checkInstanceBeforePrinting(BaseProduct product){
        if(product instanceof Clothing){
            Clothing c = (Clothing) product;
            c.printDetails();
        } else if (product instanceof Electronics) {
            Electronics e = (Electronics) product;
            e.printDetails();
        }
    }
}
