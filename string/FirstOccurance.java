package string;

public class FirstOccurance {

    public static void main(String[] args) {
        String str1 = "leetcdeco";
        String str2 = "co";

        System.out.println(findFirstOccurance(str1, str2));
    }


    // brute force approach
    public static void firstOccurance(String str1, String str2)
    {
        int n = str1.length();
        int m = str2.length();

        for(int i=0; i<=n-m; i++)
        {
            int j = 0;

            while( j<m && str1.charAt(i+j) == str2.charAt(j))
            {
                j++;
            }

            
        }
    }

























    public static int findFirstOccurance(String str1, String str2)
    {
        
        int n = str1.length();
        int m = str2.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;

            while (j < m && str1.charAt(i + j) == str2.charAt(j)) {
                j++;
            }

            if (j == m) return i;
        }
        return -1;
    }
}

