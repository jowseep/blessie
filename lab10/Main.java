package lab10;

import lab10.Subclasses.SportSeasonTicket;
import lab10.Subclasses.TouristTicket;

public class Main {

    public static void main(String[] args) {
        
        TouristTicket touristTicket = new TouristTicket("Water World", 5, "For fun.");
        SportSeasonTicket sportSeasonTicket = new SportSeasonTicket("To watch sports.", 5.00);

        System.out.println(touristTicket.isValid());
        System.out.println(touristTicket.use());
        System.out.println(touristTicket.isValid());

        sportSeasonTicket.loadUp(3);
        System.out.println(sportSeasonTicket.useOnce());
        System.out.println(sportSeasonTicket.getNumberOfUse());
        System.out.println(sportSeasonTicket.useOnce());
        System.out.println(sportSeasonTicket.getNumberOfUse());
        System.out.println(sportSeasonTicket.useOnce());
        System.out.println(sportSeasonTicket.getNumberOfUse());
        System.out.println(sportSeasonTicket.useOnce());

        sportSeasonTicket.loadUp(2);
        System.out.println(sportSeasonTicket.useOnce());
        System.out.println(sportSeasonTicket.useOnce());
        System.out.println(sportSeasonTicket.useOnce());
    }
    
}
