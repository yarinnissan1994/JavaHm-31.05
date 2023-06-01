package Store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }
}
