package Store;

public class ProductSale extends Product{
    private double discount;
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double calcFinalPrice(double originalPrice){
        return originalPrice - discount;
    }
}
