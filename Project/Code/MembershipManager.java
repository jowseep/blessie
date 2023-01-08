import java.io.*;
import java.util.*;

public class MembershipManager {
  private Map<String, Member> members;  // Map to store member records

  public MembershipManager(String membersFile, String instructionsFile) throws IOException {
    members = new HashMap<>();
    loadMembers(membersFile);
    processInstructions(instructionsFile);
  }

  // Loads member records from a file
  private void loadMembers(String fileName) throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] parts = line.split(";");
        String name = parts[0].trim();
        String birthday = parts[1].trim();
        String pass = parts[2].trim();
        String mobile = parts[3].trim();
        double fee = Double.parseDouble(parts[4].trim().substring(1));  // remove '$' and parse fee
        Member member = new Member(name, birthday, pass, mobile, fee);
        members.put(mobile, member);  // use mobile as the key to store member record
      }
    }
  }

  // Processes instructions from a file
  private void processInstructions(String fileName) throws IOException {
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
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
          members.put(mobile, member);
        } else if (command.equals("delete")) {
          String mobile = parts[1].trim();
          members.remove(mobile);
        } else if (command.equals("query")) {
          String mobile = parts[1].trim();
          Member member = members.get(mobile);
          if (member != null) {
            System.out.println(member);
          } else {
            System.out.println("Member not found.");
          }
        } else if (command.equals("save")) {
          saveMembers();
        }
      }
    }
  }

  // Saves member records to a file
  private void saveMembers() throws IOException {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("members.txt"))) {
      for (Member member : members.values()) {
        String line = String.format("%s; %s; %s; %s; $%.2f",
            member.getName(), member.getBirthday(),
