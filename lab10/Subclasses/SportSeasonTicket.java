package lab10.Subclasses;

import lab10.Abstract.Ticket;
import lab10.Interfaces.MultiUseTicketing;

public class SportSeasonTicket extends Ticket implements MultiUseTicketing {

    private double cost;
    private double loadUpCost;
    private String purpose;
    private int numberOfUse;
    // private boolean isValid; //gi initialize nako sa true kay multiple naman so dili na lang kay magdepend siya sa numberOfUse;

    public SportSeasonTicket(int numberOfUse, boolean isValid, double cost, double loadUpCost, String purpose) {
        this.numberOfUse = numberOfUse;
        // this.isValid = isValid;
        this.cost = cost;
        this.loadUpCost = loadUpCost;
        this.purpose = purpose;
    }

    public SportSeasonTicket(String purpose, double cost) {
        this.purpose = purpose;
        this.cost = cost;
    }

    @Override
    public void loadUp(int num) {
        numberOfUse = num;
    }

    @Override
    public boolean useOnce() {
        if(numberOfUse!=0) {
            numberOfUse-=1;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double getLoadUpCost(int num) {
        loadUpCost = (getCost() * num);
        return loadUpCost;
    }

    @Override
    public String getPurpose() {
        return purpose;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public boolean isValid() {
        if(numberOfUse==0) {
            return false;
        } else {
            return true;
        }
    }

    public int getNumberOfUse() {
        return numberOfUse;
    }
    
}
