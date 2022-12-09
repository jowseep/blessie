import java.util.Scanner;

public class sportsMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name to create a new pass: ");
        String name = sc.next();

        SportsVenuePass newPass = new SportsVenuePass(name);

        System.out.println("The pass id for " + newPass.name + " is: " + newPass.getPassId());

        System.out.print("Enter the pass id to enter: ");
        int passId = sc.nextInt();

        if(passId==newPass.getPassId() && newPass.isUsed()==false) {
            System.out.println("Successful");
            newPass.useThisPass(passId);
        } else {
            System.out.println("Your pass has already been used.");
        }

        System.out.print("Enter the pass id to enter: ");
        passId = sc.nextInt();

        if(passId == newPass.getPassId() && newPass.isUsed()==false) {
            System.out.println("Successful");
            newPass.useThisPass(passId);
        } else {
            System.out.println("Your pass has already been used.");
        }

        sc.close();

    }
    
}
