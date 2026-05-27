public class StringToInteger {
    public static void main(String[] args) {

        String s = "-91283472332";

        s = s.trim();
        String num = "";
        String numbers = "0123456789";
        
        int i=0;
        if(s.charAt(i) == '-')
        {
            i++;
        }

        while(i<s.length() && numbers.indexOf(s.charAt(i)) != -1)
        {
            num = num + "" + s.charAt(i);
            i++;
        }
        System.out.println(num);

        Long result = Long.parseLong(num);
        if(s.charAt(0) == '-')
        {
            result = -result;
        }

        System.out.println(result);

    }
}
