public class degreeCost {

    public static void main(String[] args) {

        float cost = 7000;
        
        for(int i=0; i<2; i++) {
            cost += (cost*0.03);
        }

        System.out.println(cost);
    }
    
}
