import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HCMMMain {

    public static void main(String[] args) throws IOException {

        ArrayList<Member> members = new ArrayList<>();
        String membersFile = "C:\\Users\\calla\\Desktop\\sample\\eme\\blessie\\Project\\Code\\membersFile.txt";
        // String instructionsFile = "C:\\Users\\calla\\Desktop\\sample\\eme\\blessie\\Project\\Code\\instructionsFile.txt";

        HCMMManager hcmmManager = new HCMMManager();
        hcmmManager.loadMembersData(membersFile, members);

        // hcmmManager.loadInstructionsFile(instructionsFile, members);

        List<Member> goldType = members.stream()
            .filter(goldMember -> goldMember.getMembershipType().equals("Gold"))
            .collect(Collectors.toList());

        // 
        
        if(goldType==null) {
            System.out.println("It is empty, biatch.");
        } else {
            for (Member sumn : goldType) {
                System.out.println(sumn.toString());
            }
        }
    }
    
}
