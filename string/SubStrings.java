package string;

public class SubStrings {
    public static void main(String[] args) {
        String str = "abcde";

        findSubStrings(str);
    }

    public static void findSubStrings(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            String ans = "";
            for(int j=i; j<str.length(); j++)
            {
                ans = ans+""+str.charAt(j);
                System.out.println(ans);
            }
            System.out.println();
        }
    }
}
