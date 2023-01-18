public class PackagedItem extends Product {
    
    private int quantityInPackage;
    private String useBy;
    private double tax = 0.10;

    public PackagedItem(String itemName, double initialPrice, int quantityInPackage, String useBy) {
        super(itemName, initialPrice);
        this.quantityInPackage = quantityInPackage;
        this.useBy = useBy;
    }

    public double getPriceAfterTax() {
        return getInitialPrice() + (getInitialPrice() * getTax());
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

    public double getTax() {
        return tax;
    }
    
}
