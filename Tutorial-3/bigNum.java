import java.util.Scanner;

public class bigNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers and we'll tell you which is way larger: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b) {
            System.out.println("I'm sorry but you entered the same number.");
        } else {
            System.out.println("The largest number is " + max(a, b));
        }

        sc.close();
    }

    public static int max(int a, int b) {
        int big = a;

        if(b>a) {
            b = big;
        } 

        return big;

    }
    
}
