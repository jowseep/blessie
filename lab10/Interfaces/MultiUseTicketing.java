package lab10.Interfaces;

public interface MultiUseTicketing {
    
    // this method will be called to add a specified amount of uses to the ticket (each is called a use-entitlement)
    public void loadUp(int numberOfUse);

    // this method will be called to signify that the ticket is to be used one more time
    public void useOnce();

    // returns the price required to increase the number of remaining uses of the ticket, for the number of uses specified
    public double getLoadUpCost(int numberOfUse);
}
