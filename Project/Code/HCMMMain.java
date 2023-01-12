import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HCMMMain {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Member> members = new ArrayList<>();
        String membersFile = "/Users/josephcallao/Desktop/java/blessie/Project/Code/membersFile.txt";

        HCMMManager hcmmManager = new HCMMManager();
        hcmmManager.loadMembersData(membersFile, members);

        String keyword = "Harry";

        for(int i=0; i<members.size(); i++) {
            if(members.get(i).getName().contains(keyword)) {
                members.remove(i);
            }
        }

        for(Member sumn:members) {
            System.out.println(sumn.toString());
        }

    }
    
    // String instructionsFile = "C:\\Users\\calla\\Desktop\\sample\\eme\\blessie\\Project\\Code";
}
