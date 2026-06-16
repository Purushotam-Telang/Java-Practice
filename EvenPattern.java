public class EvenPattern{
    public static void main(String[] args) {
        /*
         * n=5
         * **
         * ****
         * ******
         * ********
         * **********
         */

        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=0; j < i*2; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}