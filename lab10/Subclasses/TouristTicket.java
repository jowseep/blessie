package lab10.Subclasses;
import lab10.Abstract.Ticket;
import lab10.Interfaces.SingleUseTicketing;

public class TouristTicket extends Ticket implements SingleUseTicketing{

    private String touristAttactionName;
    private double price;
    private boolean isValid = true;

    public TouristTicket(String touristAttactionName, double price) {
        this.touristAttactionName = touristAttactionName;
        this.price = price;
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
        return "Purpose: Tourist attraction.";
    }

    @Override
    public double getCost() {
       return 17.00;
    }

    @Override
    public boolean isValid() {
        return isValid;
    }

    public String getTouristAttactionName() {
        return touristAttactionName;
    }

    public void setTouristAttactionName(String touristAttactionName) {
        this.touristAttactionName = touristAttactionName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
