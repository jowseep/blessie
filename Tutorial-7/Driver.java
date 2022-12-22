import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
        ComputerShop computerShop = new ComputerShop();
        Part part = new Part();
        ArrayList<Part> parts = new ArrayList<>();
        String pathName = "/Users/josephcallao/Desktop/java/blessie/Tutorial-7/parts.txt";
        String fileName = "parts-report.txt";
        int selection;
        try (Scanner input = new Scanner(System.in)) {
            computerShop.createList(part);
            computerShop.loadPartsData(pathName, parts);

            while(true) {

                System.out.println("\n");
                System.out.println("What would you like to do? ");
                System.out.println("1 - Show Parts ");
                System.out.println("2 - Report Parts ");
                System.out.println("3 - Sell Parts");
                System.out.println("4 - Exit ");

                System.out.println("\n");
                System.out.print("Selection: ");
                selection = input.nextInt();

                switch(selection) {

                    case 1:
                    computerShop.showParts(parts);
                    break; 
                    case 2:
                    computerShop.reportParts(fileName, parts);
                    break; 
                    case 3:
                    computerShop.showParts(parts);
                    break; 
                    case 4:
                    System.exit(0);
                }
            }
        }

    }
}
