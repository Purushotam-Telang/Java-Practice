public class Pyramid{
    public static void main(String[] args) {
        //Centered Pyramid of Stars
        //     * 
        //    ***
        //   *****
        //  *******
        // *********

        int n=5;

        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0; j<i*2+1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Centered Pyramid of Stars with space
        //     * 
        //    * *
        //   * * *
        //  * * * *
        // * * * * *

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}