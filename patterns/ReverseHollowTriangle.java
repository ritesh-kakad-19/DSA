package patterns;

//  *   *   *   *   *
//    *           *
//      *       * 
//        *   *
//          *

public class ReverseHollowTriangle {
    public static void main(String[] args) {
        
        int n = 5;

        for(int i=0; i<=0; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("* ");
            }
        }
        System.out.println();

        for(int i=1; i<n; i++)
        {
            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }

            for(int j=i; j<n; j++)
            {
                if(j == i || j == n-1)
                {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
