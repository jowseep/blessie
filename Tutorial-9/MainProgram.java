import java.util.ArrayList;
// import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        
        Purchase purchase = new Purchase();
        FreshFruitItem watermelon = new FreshFruitItem("Apple", 2.5, 1200);
        UtensilItem knife = new UtensilItem("Knife", 12.5, "Metal");
        PackagedItem chocolate = new PackagedItem("Chocolate", 3.5, 1, null);

        ArrayList<Product> cart = new ArrayList<>();
        cart.add(watermelon);
        cart.add(knife);
        cart.add(chocolate);

        // ArrayList<Product> cart = (ArrayList<Product>) Arrays.asList(watermelon,knife,chocolate);
        purchase.produceDocket(cart);
    }
    
}