import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{

        String membersFile = "C:\\Users\\calla\\Desktop\\sample\\eme\\blessie\\Project\\Code\\membersFile.txt";
        String instructionsFile = "C:\\Users\\calla\\Desktop\\sample\\eme\\blessie\\Project\\Code";

        MembershipManager membershipManager;
        membershipManager = new MembershipManager(membersFile, instructionsFile);
    }
    
}
