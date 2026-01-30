package patterns;


//  1   2   3   4
//    2   3   4
//      3   4
//        4
//      3   4
//    2   3   4
//  1   2   3   4


public class MirrorImageTrianglePattern {
    public static void main(String[] args) {
        

        int n=4;

        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<i; j++)
            {
                System.out.print(" ");
            }

            for(int j=i; j<=n; j++)
            {
                System.out.print(j +" ");
            }

            System.out.println();
        }

        for(int i=2; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }

            for(int j=n-i+1; j<=n; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
