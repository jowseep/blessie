import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {
        ArrayList<Part> listOfParts = new ArrayList<>();
        String pathName = "/Users/josephcallao/Desktop/java/blessie/Tutorial-7/parts.txt";

        try {
            Part part = new Part();
            File filePath = new File(pathName);
            Scanner fileInfo = new Scanner(filePath);
            int i = 0;

            while(fileInfo.hasNextLine()) {
                if(i%3 == 0){
                    part = new Part();
                    part.setName(fileInfo.nextLine());
                } else if (i%3 == 1){
                    part.setDescription(fileInfo.nextLine());
                } else if(i%3 == 2){
                    part.setPrice(Double.parseDouble(fileInfo.nextLine()));
                    part.setQuantityInStock(5);
                    listOfParts.add(part);
                }   
                i++;
            }
            
            for(Part x:listOfParts) {
                System.out.println(x.toString());
            }
            
            fileInfo.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    
}
