package string;


// incomplete
public class SubStrings {
    public static void main(String[] args) {
        String str = "abcde";

        findSubStrings(str);
    }

    public static void findSubStrings(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
            int j=i;
            while(j<str.length())
            {
                System.out.print(str.charAt(j))
            }
        }

        

        
    }
}
