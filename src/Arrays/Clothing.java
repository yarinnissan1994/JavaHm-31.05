package Arrays;

public class Clothing extends BaseProduct {
    public char size;
    public String fabric;

    public Clothing(String name, String description, double price, char size, String fabric) {
        super(name, description, price);
        this.size = size;
        this.fabric = fabric;
    }

    @Override
    public void printDetails(){
        System.out.println("Product name: "+ name);
        System.out.println("Product description: "+ description);
        System.out.printf("Price: %,.2f$\n", price);
        System.out.println("Size: "+size);
        System.out.println("Fabric: "+ fabric);
    }
}
