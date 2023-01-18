public class UtensilItem extends Product {

    private String materialType;

    public UtensilItem(String itemName, double initialPrice, String materialType) {
        super(itemName, initialPrice);
        this.materialType = materialType;
    }

    public double getPriceAfterTax() {
        return getInitialPrice() + (getInitialPrice() * 0.05);
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }
    
}
