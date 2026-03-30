package string;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = " ";

       String result = str.replaceAll("[^a-zA-Z0-9]", "");      // replace all non alpha-numeric characters by ""
       System.out.println(result);

       System.out.println(validPalindrome(result.toLowerCase()));
        
    }

    public static boolean validPalindrome(String str)
    {
        if(str.equals(""))
        {
            return true;
        }
        String reverse = "";

        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            reverse = ch +""+reverse;
        }

        System.out.println(reverse);

        if(str.equals(reverse))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
