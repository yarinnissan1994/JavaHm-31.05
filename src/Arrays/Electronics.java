package Arrays;

public class Electronics extends BaseProduct {
    public String manufacturer;
    public String batteryCapacity;

    public Electronics (String name, String description, double price, String manufacturer, String batteryCapacity) {
        super(name, description, price);
        this.manufacturer = manufacturer;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void printDetails(){
        System.out.println("Product name: "+ name);
        System.out.println("Product description: "+ description);
        System.out.printf("Price: %,.2f$\n", price);
        System.out.println("Manufacturer: "+ manufacturer);
        System.out.println("Battery capacity: : "+ batteryCapacity);
    }
}
