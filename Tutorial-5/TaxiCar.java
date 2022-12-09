public class TaxiCar {

    private String make;
    private String model;
    private String licensePlate;
    private double kmDriven;
    private boolean isDriven;

    public TaxiCar(String make, String model, String licensePlate, double kmDriven, boolean isDriven) {
        this.make = make;
        this.model = model;
        this.licensePlate = licensePlate;
        this.kmDriven = kmDriven;
        this.isDriven = isDriven;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(double km) {
        this.kmDriven += km;
    }

    public boolean isDriven() {
        return isDriven;
    }

    public void setDriven(boolean isDriven) {
        this.isDriven = isDriven;
    }

    @Override
    public String toString() {
        return "Make: " + getMake() + " | Model: " +getModel();
    }
}
