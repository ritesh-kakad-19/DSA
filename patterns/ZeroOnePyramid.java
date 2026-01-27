package patterns;


//  1
//  0  1
//  1  0  1
//  0  1  0  1
//  1  0  1  0  1

public class ZeroOnePyramid {
    public static void main(String[] args) {
        

        int n=5;
        

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if(j == i || (i-j)%2 == 0)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }
    }
}
