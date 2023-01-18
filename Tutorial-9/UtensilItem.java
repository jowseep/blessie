public class UtensilItem extends Product {

    private String materialType;
    private double tax = 0.05;

    public UtensilItem(String itemName, double initialPrice, String materialType) {
        super(itemName, initialPrice);
        this.materialType = materialType;
    }

    public double getPriceAfterTax() {
        return getInitialPrice() + (getInitialPrice() * getTax());
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public double getTax() {
        return tax;
    }
    
}
