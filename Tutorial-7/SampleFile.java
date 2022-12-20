import java.io.File;
import java.util.Scanner;

public class SampleFile {

    public static void main(String[] args) {
        // String path = "/Users/josephcallao/Desktop/java/blessie";
        // File dirList = new File(path);
        // String[] dList = dirList.list();

        // for(int i=0; i<dList.length; i++) {
        //     System.out.println(dList[i]);
        // }

        try {

            String path = "/Users/josephcallao/Desktop/java/blessie/Tutorial-7/sample.txt";
            File dirList = new File(path);
            Scanner inputFile = new Scanner(dirList);

            while(inputFile.hasNextLine()) {
                System.out.println(inputFile.nextLine());

            }
            
            inputFile.close();
        } catch (Exception e) {
            System.out.println("Error has occured. Please try again.");
        }
    }
}