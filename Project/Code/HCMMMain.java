import java.io.IOException;
import java.util.ArrayList;

public class HCMMMain {

    public static void main(String[] args) throws IOException {

        ArrayList<Member> members = new ArrayList<>();
        String membersFile = "C:\\Users\\calla\\Desktop\\sample\\eme\\blessie\\Project\\Code\\membersFile.txt";
        String instructionsFile = "C:\\Users\\calla\\Desktop\\sample\\eme\\blessie\\Project\\Code\\instructionsFile.txt";


        HCMMManager hcmmManager = new HCMMManager();
        hcmmManager.loadMembersData(membersFile, members);

        hcmmManager.loadInstructionsFile(instructionsFile, members);
        
    }
    
}
