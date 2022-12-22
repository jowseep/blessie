import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) throws FileNotFoundException {
        ComputerShop computerShop = new ComputerShop();
        Part part = new Part();
        ArrayList<Part> parts = new ArrayList<>();
        String pathName = "C:\\Users\\calla\\Desktop\\sample\\eme\\Tutorial-7\\Activity\\parts.txt";
        String fileName = "parts-report.txt";

        computerShop.createList(part);
        computerShop.loadPartsData(pathName, parts);
        computerShop.showParts(parts);
        computerShop.reportParts(fileName, parts);
    }
}
