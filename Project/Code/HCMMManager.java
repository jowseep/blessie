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

                ArrayList<String> word = new ArrayList<>();
                String[] words = line.trim().split("[;\\s+;]");
      
                for(int i=0; i<words.length; i++) {
                    word.add(words[i]);
                }
      
                for(int i=0; i<word.size(); i++) {
                    if(word.get(i).equals("")) {
                        word.remove(word.get(i));
                    }
                }

                if (word.get(0).equals("add")) {

                  String name = word.get(2) + " " + word.get(3);
                  String birthday = word.get(5);
                  String pass = word.get(9);
                  String mobile = word.get(7);
                  double fee = Double.parseDouble(word.get(11));  // remove '$' and parse fee
                  Member member = new Member(name, birthday, pass, mobile, fee);
                  members.add(member);

                } else if (word.get(0).equals("delete")) {
                    String name = word.get(1) + " " + word.get(2);

                    for(int i=0; i<members.size(); i++) {
                        if(members.get(i).getName().equals(name)) {
                            members.remove(i);
                        }
                    }

                } else if (word.get(0).equals("query")) {
                    if(word.get(1).equals("pass")) {
                        String passType = word.get(2);

                        switch (passType) {
                            case "Bronze":
                                
                                break;
                            case "Silver":

                                break;
                            case "Gold":

                                break;
                            default:
                                break;
                        }
                    }
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

    // double fee = Double.parseDouble(parts[5].trim().substring(1));  // remove '$' and parse fee

}
