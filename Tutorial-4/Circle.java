public class Circle {

    private double radius;
    double area;

    public Circle() {}

    public Circle (double r) {
        radius = r;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "The radius is " + getRadius() + " and the area is " + getArea() + "";
    }
    
    public boolean equals(Circle cir1, Circle cir2) {


        if(cir1.equals(cir2)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean greaterThan(Circle cir1, Circle cir2) {

        if(cir1.getArea()>cir2.getArea()) {
            return true;
        } else {
            return false;
        }
    }

    public Circle(double r, double area) {
        radius = r;
        this.area = area;
    }

}