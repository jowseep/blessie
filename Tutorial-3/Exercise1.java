import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int numArray = sc.nextInt();

        double[] nums = new double[numArray];

        for(int i=0; i<nums.length; i++) {
            System.out.print("Enter number " + (i+1) + " : ");
            nums[i] = sc.nextDouble();
        }

        System.out.println("The sum is " + sum(nums));
        System.out.println("The average is " + average(sum(nums), nums.length));
        System.out.println("The largest number is " + maxNum(nums));
        System.out.println("The smallest number is " + minNum(nums));

        sc.close();
    }


    public static double sum(double[] a) {

        int total = 0;
        for(int i=0; i<a.length; i++) {
            total+=a[i];
        }

        return total;
    }

    public static double average(double a, int b) {
        return a/b;
    }

    public static double maxNum(double[] a) {

        double big = a[0];
        for(int i=1; i<a.length; i++) {
            if(a[i]>big) {
                big = a[i];
            }
        }

        return big;
    }

    public static double minNum(double[] a) {
        double small = a[0];
        for(int i=1; i<a.length; i++) {
            if(a[i]<small) {
                small = a[i];
            }
        }

        return small;
    }

}