package imp;

// multiply two string without using builtin funs=ction
public class MultiplyStrings {
    public static void main(String[] args) {
        String num1 = "123456789";
        String num2 = "987654321";

       // calculateMultiplication(num1, num2);
        multiplication(num1, num2);
    }


    // brute force approach (not useful for large integers)
    public static void calculateMultiplication(String num1, String num2){

        int n1 = 0;
        for(int i=0; i<num1.length(); i++)
        {
            char n = num1.charAt(i);
            int digit = n - '0';
            n1 = (n1 * 10) + digit;
        }
        System.out.println(n1);

        int n2 = 0;
        for(int i=0; i<num2.length(); i++)
        {
            char n = num2.charAt(i);
            int digit = n - '0';
            n2 = (n2 * 10) + digit;
        }
        System.out.println(n2);

        int ans = n1*n2;
        System.out.println(ans);
    }

    // approach 2
    public static void  multiplication(String num1, String num2)
    {
        String n1 = num1;
        String n2 = num2;
        if(num1.length() > num2.length())
        {
            n1 = num2;
            n2 = num1;
        }

        long ans = 0;
        for(int i=n1.length()-1; i>= 0; i--)
        {
            int carry = 0;
            long mlt = 0;
            int currI = n1.charAt(i) - '0';

            for(int j=n2.length()-1; j>= 0; j--)
            {
                int currJ = n2.charAt(j) - '0';
                int currMlt = (currI * currJ) + carry;
                carry = 0;
                if(j > 0 && currMlt > 9){
                    int lastDigit = (currMlt % 10);
                    carry = currMlt / 10;
                    currMlt = lastDigit;
                }

                mlt = (Math.powExact(10, n2.length()-1 - j) * currMlt) + mlt;
        
                System.out.println(currI +" "+ currJ + " "+ currMlt+ " "+ carry+" "+ mlt);
                
            }
            mlt = (Math.powExact(10, n1.length()-1-i)) * mlt;
            ans += mlt;
        }

        System.out.println(ans);
    }
}
