package patterns;


//        *                 *
//        *  *           *  *
//        *  *  *     *  *  *
//        *  *  *  *  *  *  *
//        *  *  *     *  *  *
//        *  *           *  *
//        *                 *

public class ButterflyPattern {
    public static void main(String[] args) {
        

        int n = 4;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }

            for(int j=i+1; j<= (2*n)-1-i; j++)
            {
                System.out.print("  ");
            }

            for(int j= (2*n)-i; j<= (2*n) - 1; j++)
            {
                if(i == n && j == (2*n) - 1)
                {
                    continue;
                }
                else{
                    System.out.print("* ");
                }
            }

            System.out.println();
        }

        for(int i=n-1; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }

            for(int j=i+1; j<= (2*n)-1-i; j++)
            {
                System.out.print("  ");
            }

            for(int j=(2*n)-i; j<=(2*n)-1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
