import java.util.Scanner;

public class Exercise4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter how many names you'd like to enter: ");
        int numofNames = sc.nextInt();
        sc.nextLine();

        String[] listofNames = new String[numofNames];
        boolean hasOtherCharacter = false;
        String otherCharacter = " ";

        for(int i=0; i<listofNames.length; i++) {
            System.out.print("Enter a name: ");
            String name = sc.nextLine();

            if(!names(name)) {
                listofNames[i] = name;
            } else {
                otherCharacter = name;
                hasOtherCharacter = true;
                break;
            }

        }
        
        if(hasOtherCharacter) {
            System.out.println("Sorry, " + otherCharacter + " is invalid as it contains either a number or a special character. ");
        } else {
            System.out.println(" ");
            System.out.println("Here are the list of names: ");
            for(int i=0; i<listofNames.length; i++) {
                System.out.println((i+1) + ". " + listofNames[i]);
            }
        }

        sc.close();
        
    }

    public static boolean names(String name) {

        boolean regex = false;

        for(int i=0; i<name.length(); i++) {
            if(name.contains("j")) {
                regex = true;
            }
        }

        return regex;
    }
}
