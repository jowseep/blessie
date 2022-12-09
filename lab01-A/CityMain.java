public class CityMain {
    
    public static void main(String[] args) {
        City one = new City("Boston", "U.S.A", 4590000, "42 North", "71 West");
        City two = new City("Sydney", "Australia", 4627345, "33 South", "151 East");
        City three = new City("Johannesburg", "South Africa", 1009035, "26 South", "28 East");
        City four = new City("Kuala Lumpur", "Malaysia", 1627172, "3 North", "101 East");
        City five = new City("Rio de Janeiro", "Brazil", 6323037, "22 South", "43 West");

        String theOne = one.toString();
        String theTwo = two.toString();
        String theThree = three.toString();
        String theFour = four.toString();
        String theFive = five.toString();

        System.out.println(theOne);
        System.out.println(theTwo);
        System.out.println(theThree);
        System.out.println(theFour);
        System.out.println(theFive);

        four.setPopulation(2000000);

        System.out.println("The new population of Kuala Lumpur is " + four.getPopulation());
    }
}
