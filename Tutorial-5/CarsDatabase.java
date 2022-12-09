import java.util.ArrayList;

public class CarsDatabase {

    public CarsDatabase() {}

    public ArrayList<TaxiCar> addToCarsDatabase(ArrayList<TaxiCar> newTaxiCar) {
        return newTaxiCar;
    }

    public int totalCars(ArrayList<TaxiCar> newTaxiCar) {
        int total = newTaxiCar.size();

        return total;
    }

    public ArrayList<TaxiCar> carsOnStreets(ArrayList<TaxiCar> newTaxiCar) {

        ArrayList<TaxiCar> carsOnStreet = new ArrayList<TaxiCar>();

        for(int i=0; i<newTaxiCar.size(); i++) {
            if(newTaxiCar.get(i).isDriven()==true) {
                carsOnStreet.add(newTaxiCar.get(i));
            }
        }
        return carsOnStreet;
    }

    public ArrayList<TaxiCar> carsAvailable(ArrayList<TaxiCar> newTaxiCar) {

        ArrayList<TaxiCar> carsOnStreet = new ArrayList<TaxiCar>();

        for(int i=0; i<newTaxiCar.size(); i++) {
            if(newTaxiCar.get(i).getKmDriven()<=0) {
                carsOnStreet.add(newTaxiCar.get(i));
            }
        }
        return carsOnStreet;
    }

    public ArrayList<TaxiCar> searchMake(ArrayList<TaxiCar> newTaxiCar, String make) {

        ArrayList<TaxiCar> carsOnStreet = new ArrayList<TaxiCar>();

        for(int i=0; i<newTaxiCar.size(); i++) {
            if(newTaxiCar.get(i).getMake().contains(make)) {
                carsOnStreet.add(newTaxiCar.get(i));
            }
        }
        return carsOnStreet;
    }

    public ArrayList<TaxiCar> searchKM(ArrayList<TaxiCar> newTaxiCar, double km) {

        ArrayList<TaxiCar> carsOnStreet = new ArrayList<TaxiCar>();

        for(int i=0; i<newTaxiCar.size(); i++) {
            if(newTaxiCar.get(i).getKmDriven()>=km) {
                carsOnStreet.add(newTaxiCar.get(i));
            }
        }
        return carsOnStreet;
    }
    
   
}
