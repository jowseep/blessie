package lab10.Abstract;

public abstract class Ticket {

    // returns a String describing the purpose for which the ticket may be used
    public abstract String getPurpose();

    // returns an amount signifying the cost of obtaining the ticket
    public abstract double getCost();

    // returns a boolean value indicating if the ticket is valid for use, or not.
    public abstract boolean isValid(); 
    
}
