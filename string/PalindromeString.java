package string;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "abdcba";
        checkPalindrome(str);
    }

    public static void checkPalindrome(String str)
    {
        String revStr = "";

        for(int i=str.length()-1; i>=0; i--)
        {
            char ch = str.charAt(i);
            revStr = revStr + "" + ch;
        }

        if(str.equals(revStr))
        {
            System.out.println(str +" is palindrome");
        }
        else{
            System.out.println(str+" is not palindrome");
        }
    }
}
