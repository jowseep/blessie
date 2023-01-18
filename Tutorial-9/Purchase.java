import java.util.ArrayList;

public class Purchase {
    
    ArrayList<Product> cart = new ArrayList<>();
    FreshFruitItem freshFruitItem;
    PackagedItem packagedItem;
    UtensilItem utensilItem;

    public void addToPurchase(Product product) {
        if(cart.size()>4) {
            System.out.println("Sorry, you can only purchase 4 items.");
        } else {
            cart.add(product);
        }
    }

    public void produceDocket(Object object) {
        System.out.println("Items Purchased:/n ");
        
        for(int i=0; i<cart.size(); i++) {
            // System.out.println(cart.get(i).getItemName() + " @ " + cart.get(i).getInitialPrice() + " , Tax: " + (cart.get(i).getPriceAfterTax() - cart.get(i).getInitialPrice()) + ", Weight: " + cart.get(i));
            if(object.equals(freshFruitItem)) {

            } else if(object.equals(packagedItem)) {

            } else {
                
            }
        }
    }
}
