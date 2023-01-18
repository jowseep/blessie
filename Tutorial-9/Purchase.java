import java.util.ArrayList;

public class Purchase {
    
    ArrayList<Product> cart = new ArrayList<>();

    public void addToPurchase(Product product) {
        cart.add(product);
    }

    public void produceDocket(Product product) {
        System.out.println();
    }
}
