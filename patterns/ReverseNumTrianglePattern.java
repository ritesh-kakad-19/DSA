package patterns;


//  1   2   3   4
//    2   3   4
//      3   4
//        4


public class ReverseNumTrianglePattern {
    public static void main(String[] args) {
        

        int n = 4;

        for(int i=1; i<=n; i++)
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
    }
}
