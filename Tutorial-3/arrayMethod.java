public class arrayMethod {

    public static void main(String[] args) {

        int[] x = {1,2,3,4,5};
        for(int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }

        exch(x, 0, x.length-1);

        for(int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }
    }

    // iyaha lang gi switch ang x[0] and x[4]
    public static void exch(int[] a, int i, int j) {
        int t = a[j]; 
        a[j] = a[i];
        a[i] = t;
    }
}