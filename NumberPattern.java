public class NumberPattern {
    public static void main(String[] args) {
        //Number pattern
        //     1
        //    121
        //   12321
        //  1234321
        // 123454321

        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            
            for(int j=1; j <= i; j++){
                System.out.print(j+"");
            }

            for(int j=i; j>1; j--){
                System.out.print(j-1+"");
            }

            System.out.println();
        }

        System.out.println("\n\n");

        //Number pattern
        //     5
        //    545
        //   54345
        //  5432345
        // 543212345

        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            
            for(int j=1; j <= i; j++){
                System.out.print(n-j+1+"");
            }

            for(int j=n-(i-1); j<n; j++){
                System.out.print((j+1)+"");
            }

            System.out.println();
        }

    }
    
}
