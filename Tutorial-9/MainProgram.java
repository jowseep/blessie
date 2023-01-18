public class MainProgram {

    public static void main(String[] args) {
        
        FreshFruitItem apple = new FreshFruitItem("Apple", 6, 5);
        UtensilItem spoon = new UtensilItem("Spoon", 12, "Wood");

        System.out.println("Price after tax of " + spoon.toString() + " is " + spoon.getPriceAfterTax());
        System.out.println(apple.toString());
    }
    
}