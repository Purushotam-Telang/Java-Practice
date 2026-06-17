public class ZerosAndOne {
    public static void main(String[] args) {
        // Binary 0 and 1 Patter
        // 1
        // 0 1
        // 0 1 0
        // 1 0 1 0
        // 1 0 1 0 1
        
        int n=5;

        for(int i=1; i<=n; i++){
            // for(int j=0; j<n-i; j++){
            //     System.out.print(" ");
            // }
            for(int j=1; j<= i; j++){
               
                System.out.print((i+j)%2 + " ");
 
            }
            System.out.println();
        }
    }
}
