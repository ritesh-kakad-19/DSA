package string;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "IVX";
        romanToInteger(s);

    }

    public static void romanToInteger(String s)
    {
        int output = 0;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            char next = ' ';

            if(i < s.length()-1){
                next = s.charAt(i+1);
            }
            

            if(i < s.length()-1 && ch == 'I' && next == 'V')  {
                output += 4;
                i++;
            }  
            else if(i < s.length()-1 && ch == 'I' && next == 'X'){
                 output += 9;
                i++;
            }   
            else if(i < s.length()-1 && ch == 'X' && next == 'L'){
                output += 40;
                i++;
            }   
            else if(i < s.length()-1 && ch == 'X' && next == 'C'){
                output += 90;
                i++;
            }    
            else if(i < s.length()-1 && ch == 'C' && next == 'D'){
                output += 400;
                i++;
            }    
            else if(i < s.length()-1 && ch == 'C' && next == 'M'){
                output += 900;
                i++;
            }    
            else if (ch == 'I')     output += 1;
            else if (ch == 'V')     output += 5;
            else if (ch == 'X')     output += 10;
            else if (ch == 'L')     output += 50;
            else if (ch == 'C')     output += 100;
            else if (ch == 'D')     output += 500;
            else if (ch == 'M')     output += 1000;
        }


        System.out.println(output);

    }
}
