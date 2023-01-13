public class Member {

    private String name, 
    birthday, 
    phoneNumber,
    membershipType;
    private double fee;

    public Member() {};

    public Member(String name, String birthday, String phoneNumber, String membershipType, double fee) {
        this.name = name;
        this.birthday = birthday;
        this.membershipType = membershipType;
        this.phoneNumber = phoneNumber;
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

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString() {
        return name + 
                "\n" + birthday +
                "\n" + phoneNumber +
                "\n" + membershipType +
                "\n" + fee;
    }

}