package patterns;

//   *  *  *  *  *
//   *           *
//   *           *
//   *           *
//   *  *  *  *  *

public class HollowSquare {
    public static void main(String[] args) {
        
        int n=5;

        for(int i=0; i<=0; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("* ");
            }
        }
        System.out.println();

        for(int i=1; i<n-1; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(j == 0 || j == n-1)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i=n-1; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("* ");
            }
        }
    }
}
