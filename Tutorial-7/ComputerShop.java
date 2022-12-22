import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ComputerShop {

    public void createList(Part part) {
        ArrayList<Part> parts = new ArrayList<>();
        parts.add(part);
    }

    public void loadPartsData(String pathName, ArrayList<Part> parts) {
        try {
            File filePath = new File(pathName);
            Scanner fileInfo = new Scanner(filePath);

            while(fileInfo.hasNextLine()) {
                Part part = new Part();
                part.setName(fileInfo.nextLine());
                part.setDescription(fileInfo.nextLine());
                part.setPrice(Double.parseDouble(fileInfo.nextLine()));
                part.setQuantityInStock(5);
                parts.add(part);
            }
            fileInfo.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void showParts(ArrayList<Part> parts) {
        for(Part sumn:parts) {
            System.out.println(sumn.toString());
            System.out.println();
        }
    }

    public void reportParts(String fileName, ArrayList<Part> parts) throws FileNotFoundException {
            File fw = new File(fileName);
            PrintWriter output = new PrintWriter(fw);
            
            for(Part sumn:parts) {
                output.println(sumn);
            }
            output.close();
    }


    public void addPart(Part part, ArrayList<Part> parts) {
        if(part == null) {
            System.out.println("Empty object, hoe.");
        } else {
            parts.add(part);
        }
    }
    
}
