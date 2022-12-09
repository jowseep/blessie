public class mainAccount {

    public static void main(String[] args) {

        Account acc1 = new Account("Joseph Callao", 1200);
        Account acc2 = new Account("Blessie Marie De La Viña", 1000000);

        System.out.println("[Account details]");
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());

        System.out.println("Does Blessie Marie have more money than Joseph? [true/false]");
        System.out.println("Answer: " + acc2.greaterThan(acc1));
    }
    
}
