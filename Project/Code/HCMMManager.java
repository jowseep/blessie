import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class HCMMManager {

    //This methods loads the MembersFile and add it into the members ArrayList
    public void loadMembersData(String pathName, ArrayList<Member> members) {
        try {
            File filePath = new File(pathName);
            Scanner fileInfo = new Scanner(filePath);

            while(fileInfo.hasNextLine()) {
                Member member = new Member();
                member.setName(fileInfo.nextLine());
                member.setBirthday(fileInfo.nextLine());
                member.setMembershipType(fileInfo.nextLine());
                member.setPhoneNumber(fileInfo.nextLine());
                member.setFee(Double.parseDouble(fileInfo.nextLine()));
                members.add(member);
            }
            fileInfo.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void loadInstructionsFile(String pathName, ArrayList<Member> members) throws FileNotFoundException, IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(pathName))) {
            String line;
            while ((line = reader.readLine()) != null) {
              String[] parts = line.split(";");
              String command = parts[0].trim();
              if (command.equals("add")) {
                String name = parts[1].trim();
                String birthday = parts[2].trim();
                String pass = parts[3].trim();
                String mobile = parts[4].trim();
                double fee = Double.parseDouble(parts[5].trim().substring(1));  // remove '$' and parse fee
                Member member = new Member(name, birthday, pass, mobile, fee);
                members.add(member);
            //   } else if (command.equals("delete")) {
            //     String mobile = parts[1].trim();
            //     members.remove(mobile);
            //   } else if (command.equals("query")) {
            //     String mobile = parts[1].trim();
            //     Member member = members.get(mobile);
            //     if (member != null) {
            //       System.out.println(member);
            //     } else {
            //       System.out.println("Member not found.");
            //     }
            //   }
            }
          }
    }
}

    // This function updates MembersFile
    public void updateMembersFile(String fileName, ArrayList<Member> members) throws FileNotFoundException {
        File fw = new File(fileName);
        PrintWriter output = new PrintWriter(fw);
        
        for(Member sumn:members) {
            output.println(sumn);
        }
        output.close();
    }

}
