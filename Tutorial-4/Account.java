public class Account {
    
    private String name;
    private double balance;

    public Account() {}

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double deposit(double amount) {
        return balance+=amount;
    }

    public double withdraw(double amount) {
        return balance-=amount;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " | Balance: " + getBalance() + "";
    }

    // this refers to the instantiated or constructed object

    public boolean equals(Account acc2) {
        
        if(this.equals(acc2)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean greaterThan(Account acc2) {

        if(this.getBalance()>acc2.getBalance()) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
