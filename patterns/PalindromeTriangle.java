package patterns;



//           1
//        2  1  2
//     3  2  1  2  3
//  4  3  2  1  2  3  4


public class PalindromeTriangle {
    public static void main(String[] args) {
        

        int n=4;


        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }

            for(int j=n-i+1; j<=n; j++)
            {
                System.out.print(n-j+1);
            }

            for(int j=2; j<= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

       
    }
}
