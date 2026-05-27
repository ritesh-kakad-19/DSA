
// leetcode problem = 6
public class ZigzagConversion {
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";

        conversion(str, 3);
    }

    public static void conversion(String str, int rows)
    {
        char arr[][] = new char[rows][str.length()];

        int r = 0;
        int c = 0;

        int rEnd = arr.length;
        int cEnd = arr[0].length;
        
        int i=0;

        while(i < str.length())
        {
            while(i < str.length() && r < rEnd)
            {
                arr[r][c] = str.charAt(i);
                r++;
                i++;
            }
            r -= 2;
            c++;

            while(i < str.length() && r >= 0)
            {
                arr[r][c] = str.charAt(i);
                r--;
                c++;
                i++;
            }

            r += 2;
            
        }

        String ans = "";
        for(int k=0; k<arr.length; k++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                ans = ans +""+arr[k][j];
                //System.out.print(arr[k][j]+" ");
            }
            //System.out.println();

        }

        System.out.println(ans);
    }
}
