import java.util.ArrayList;

public class TaxiCarMain {

    public static void main(String[] args) {
        ArrayList<TaxiCar> taxiCar = new ArrayList<TaxiCar>();
        CarsDatabase carsDatabase = new CarsDatabase();

        taxiCar.add(new TaxiCar("Tesla", "S", "JSP012", 0, false));
        taxiCar.add(new TaxiCar("Toyota", "Corola", "MUX123", 0, false));
        taxiCar.add(new TaxiCar("Mercedes Bez", "SUV-L", "IWE234", 0, false));
        taxiCar.add(new TaxiCar("Mazda", "BT-05", "NOI890", 123, true));
        taxiCar.add(new TaxiCar("Audi", "A1", "RTY470",50, true));
        taxiCar.add(new TaxiCar("Ford", "Ranger", "WQE234", 56, true));
        taxiCar.add(new TaxiCar("Porsche", "911", "PHL204", 97, true));

        carsDatabase.addToCarsDatabase(taxiCar);

        System.out.println("The total number of cars is: " + carsDatabase.totalCars(taxiCar));

        System.out.println("***********************");

        ArrayList<TaxiCar> carsStreet = new ArrayList<TaxiCar>();
        carsStreet = carsDatabase.carsOnStreets(carsDatabase.addToCarsDatabase(taxiCar));

        System.out.println("The cars currently available to drive are: ");
        for(int i=0; i<carsStreet.size(); i++) {
            System.out.println(carsStreet.get(i).getMake() + " " + carsStreet.get(i).getModel());
        }

        System.out.println("***********************");

        ArrayList<TaxiCar> carsAvailable = new ArrayList<TaxiCar>();
        carsAvailable = carsDatabase.carsAvailable(carsDatabase.addToCarsDatabase(taxiCar));

        System.out.println("The cars on streets are: ");
        for(int i=0; i<carsAvailable.size(); i++) {
            System.out.println(carsAvailable.get(i).getMake() + " " + carsAvailable.get(i).getModel());
        }

        System.out.println("***********************");

        ArrayList<TaxiCar> carsKMDriven = new ArrayList<TaxiCar>();
        carsKMDriven = carsDatabase.searchKM(carsDatabase.addToCarsDatabase(taxiCar),55);

        System.out.println("The cars with specific cars km drive are: ");
        for(int i=0; i<carsKMDriven.size(); i++) {
            System.out.println(carsKMDriven.get(i).getMake() + " " + carsKMDriven.get(i).getModel());
        }

        System.out.println("***********************");

        ArrayList<TaxiCar> carsMake = new ArrayList<TaxiCar>();
        carsMake = carsDatabase.searchMake(carsDatabase.addToCarsDatabase(taxiCar),"Porsche");

        System.out.println("Search make result: ");
        for(int i=0; i<carsMake.size(); i++) {
            System.out.println(carsMake.get(i).getMake() + " " + carsMake.get(i).getModel());
        }


    }
    
}
