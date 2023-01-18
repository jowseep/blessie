public class PackagedItem extends Product {
    
    private int quantityInPackage;
    private String useBy;

    public PackagedItem(String itemName, double initialPrice, double priceAfterTax, int quantityInPackage, String useBy) {
        super(itemName, initialPrice, priceAfterTax);
        this.quantityInPackage = quantityInPackage;
        this.useBy = useBy;
    }

    public double getPriceAfterTax() {
        return getInitialPrice() + (getInitialPrice() * 0.10);
    }

    public int getQuantityInPackage() {
        return quantityInPackage;
    }
    public void setQuantityInPackage(int quantityInPackage) {
        this.quantityInPackage = quantityInPackage;
    }
    public String getUseBy() {
        return useBy;
    }
    public void setUseBy(String useBy) {
        this.useBy = useBy;
    }
    
    
}
