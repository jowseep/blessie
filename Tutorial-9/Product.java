public class Product {

    private String itemName;
    private double initialPrice,
    priceAfterTax;
    
    public Product(String itemName, double initialPrice, double priceAfterTax) {
        this.itemName = itemName;
        this.initialPrice = initialPrice;
        this.priceAfterTax = priceAfterTax;

    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(double initialPrice) {
        this.initialPrice = initialPrice;
    }

    public double getPriceAfterTax() {
        return priceAfterTax;
    }

    @Override
    public String toString() {
        return "[ " + getItemName() + ", " + getInitialPrice() + ", " + getPriceAfterTax() + " ]";
    }
    
}