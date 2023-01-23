package lab10.Subclasses;

import lab10.Abstract.Ticket;
import lab10.Interfaces.MultiUseTicketing;

public class SportSeasonTicket extends Ticket implements MultiUseTicketing {

    @Override
    public void loadUp(int numberOfUse) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void useOnce() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public double getLoadUpCost(int numberOfUse) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getPurpose() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double getCost() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isValid() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
