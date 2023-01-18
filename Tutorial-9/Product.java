public class Product {

    private String itemName;
    private double initialPrice,
    priceAfterTax;
    

    public Product(String itemName, double initialPrice) {
        this.itemName = itemName;
        this.initialPrice = initialPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public double getPriceAfterTax() {
        return priceAfterTax;
    }

    @Override
    public String toString() {
        return getItemName();
    }
    
}