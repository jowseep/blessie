public class FreshFruitItem extends Product {

    private double weight;
    private double tax = 0.00;

    public FreshFruitItem(String itemName, double initialPrice, double weight) {
        super(itemName, initialPrice);
        this.weight = weight;
    }

    public double getPriceAfterTax() {
        return getInitialPrice() + (getInitialPrice() * getTax());
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTax() {
        return tax;
    }
}
