import java.util.ArrayList;

public class Purchase {
    
    ArrayList<Product> cart = new ArrayList<>();

    public void addToPurchase(Product product) {
        if(cart.size()>4) {
            System.out.println("Sorry, you can only purchase 4 items.");
        } else {
            cart.add(product);
        }
    }

    public void produceDocket() {
        double total = 0;
        System.out.println("Items Purchased:/n ");
        
        for(int i=0; i<cart.size(); i++) {
            if(cart.get(i) instanceof FreshFruitItem) {
                FreshFruitItem fresh = (FreshFruitItem) cart.get(i);
                System.out.println(fresh.getItemName() + " @ " + fresh.getInitialPrice() + " , Tax: " + (fresh.getPriceAfterTax() - cart.get(i).getInitialPrice()) + ", Weight: " + fresh.getWeight());
                total += fresh.getPriceAfterTax();
            } else if(cart.get(i) instanceof PackagedItem) {
                PackagedItem packed = (PackagedItem) cart.get(i);
                System.out.println(packed.getItemName() + " @ " + packed.getInitialPrice() + " , Tax: " + (packed.getPriceAfterTax() - cart.get(i).getInitialPrice()) + ", Units: " + packed.getQuantityInPackage());
                total += packed.getPriceAfterTax();
            } else {
                UtensilItem utensil = (UtensilItem) cart.get(i);
                System.out.println(utensil.getItemName() + " @ " + utensil.getInitialPrice() + " , Tax: " + (utensil.getPriceAfterTax() - cart.get(i).getInitialPrice()) + ", Material: " + utensil.getMaterialType());
                total += utensil.getPriceAfterTax();
            }
        }

        System.out.println("Total: " + total);
    }
}
