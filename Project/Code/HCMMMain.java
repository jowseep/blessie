import java.io.IOException;
import java.util.ArrayList;
// import java.util.List;
// import java.util.stream.Collectors;

public class HCMMMain {

    public static void main(String[] args) throws IOException {

        ArrayList<Member> members = new ArrayList<>();
        String membersFile = "C:\\Users\\calla\\Desktop\\sample\\eme\\blessie\\Project\\Code\\membersFile.txt";
        // String instructionsFile = "C:\\Users\\calla\\Desktop\\sample\\eme\\blessie\\Project\\Code\\instructionsFile.txt";

        HCMMManager hcmmManager = new HCMMManager();
        hcmmManager.loadMembersData(membersFile, members);
        // hcmmManager.loadInstructionsFile(instructionsFile, members);

        // List<Member> goldType = members.stream()
        //     .filter(goldMember -> goldMember.getMembershipType().equals("Bronze"))
        //     .collect(Collectors.toList());
        
        // goldType.forEach(System.out::println);

        String name = "Queen Tingz";
        String birthday = "1989-12-13";
        String mobile = "04191919";
        String pass = "Silver";
        double fee = 30.0;

        for(int i=0; i<members.size(); i++) {
            if ((!members.get(i).getName().equals(name)) && (!members.get(i).getPhoneNumber().equals(mobile)) ) {
                Member newMember = new Member(name, birthday, mobile, pass, fee);
                members.add(newMember);
                // members.get(i).setBirthday(birthday);
                // members.get(i).setFee(fee);
                // members.get(i).setMembershipType(pass);
           
            } else {
                // Member newMember = new Member(name, birthday, mobile, pass, fee);
                // members.add(newMember);
                members.get(i).setBirthday(birthday);
                members.get(i).setFee(fee);
                members.get(i).setMembershipType(pass);
            } 
        }

        for (Member mmyeah : members) {
            System.out.println(mmyeah.toString());
        }

    }
    
}
