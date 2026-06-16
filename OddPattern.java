public class OddPattern {
    public static void main(String[] args) {
        // Print Stars in Odd Numbers (1, 3, 5, 7, 9)
        // *
        // ***
        // *****
        // ******* 
        // ********* 

        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=0; j<i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
