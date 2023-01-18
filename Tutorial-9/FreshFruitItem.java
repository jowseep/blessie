public class FreshFruitItem extends Product {

    private double weight;

    public FreshFruitItem(String itemName, double initialPrice, double priceAfterTax, double weight) {
        super(itemName, initialPrice, priceAfterTax);
        this.weight = weight;
    }

    public double getPriceAfterTax() {
        return getInitialPrice() + (getInitialPrice() * 0.00);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
