package patterns;

//           *
//         *   *
//       *       *
//     *           *
//   *   *   *   *   * 


public class HollowTriangle {
    public static void main(String[] args) {

        int n = 5;
        for(int i=1; i<n; i++)
        {
            for(int j=0; j<=n-i; j++)
            {
                System.out.print(" ");
            }

            for(int j=n-i+1; j<=n; j++)
            {
                if(j == n-i+1 || j == n)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i=n; i<= n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                System.out.print(" *");
            }
        }
    }
}
