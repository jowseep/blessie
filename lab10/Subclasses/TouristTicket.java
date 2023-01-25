package lab10.Subclasses;
import lab10.Abstract.Ticket;
import lab10.Interfaces.SingleUseTicketing;

public class TouristTicket extends Ticket implements SingleUseTicketing {

    private String touristAttactionName;
    private double price;
    private boolean isValid = true;
    private String purpose;

    public TouristTicket(String touristAttactionName, double price, String purpose) {
        this.touristAttactionName = touristAttactionName;
        this.price = price;
        this.purpose = purpose;
    }

    @Override
    public boolean use() {
        if(isValid) {
            isValid = false;
            return true;
        } else {
            return false;
        }
       
    }

    @Override
    public String getPurpose() {
        return purpose;
    }

    @Override
    public double getCost() {
       return price;
    }

    @Override
    public boolean isValid() {
        return isValid;
    }

    public String getTouristAttactionName() {
        return touristAttactionName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
