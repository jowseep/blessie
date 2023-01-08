public class Member {

    private String name, 
    birthday, 
    phoneNumber,
    membershipType;
    private int fee;

    public Member(String name, String birthday, String phoneNumber, String membershipType, int fee) {
        this.name = name;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.membershipType = membershipType;
        this.fee = fee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    

}