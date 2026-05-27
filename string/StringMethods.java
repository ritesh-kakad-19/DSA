package string;

public class StringMethods {
    public static void main(String[] args) {

        String str1 = "Ritesh Kakad";
        String str2 = "Software Engineer";
        String str3 = " Java\t is\n fun ";

        // 1) length
        System.out.println(str1.length());

        // 2) charAt
        System.out.println(str1.charAt(0));

        // 3) equals to check equality
        System.out.println(str1.equals(str2));

        // 4) String to integer
        String num4 = "123";
        int num5 = Integer.parseInt(num4);
        System.out.println(num5);

        // 5) Integer to string
        int num = 123;
        String num2 = Integer.toString(num);
        System.out.println(num2.getClass()); // check type of num2

        String num3 = num + "";
        System.out.println(num3.getClass()); // check type of num3

        // 6) string to charArray
        String str = "Java";
        char[] charArray = str.toCharArray(); // charArray will be {'J', 'a', 'v', 'a'}
        // You can then access individual characters like this:
        char j = charArray[0]; // j will be 'J'

        // 7) char to string
        char ch = 'B';
        String str4 = Character.toString(ch); // str is now "B"

        // 8) char to int
        char ch2 = '7';
        int num6 = ch2 - '0'; // num will be 7

        int ch3 = 'A';
        int num7 = ch3; // num will be 65 (ASCII value of 'A')
        System.out.println(num7);

       

        // 9) remove space from string
        String text = " Java\t is\n fun ";
        String noSpaces = text.replaceAll("\\s+", "");
        System.out.println(noSpaces); // Output: Javaisfun

        // 10) Remove Only Leading and Trailing Spaces
        String text2 = "   Java is fun   ";
        String trimmed = text2.trim();
        String stripped = text2.strip();

        System.out.println(trimmed); // Output for both: Java is fun
        System.out.println(stripped);

        // 11) replace character
        String str5 = "leetcode";
        String str6 = str5.replace('t', ' ');
        System.out.println(str6);

        //12)  check the substring present or not
        String str7 = "abcd";
        System.out.println(str7.contains("e"));

        // 13) find the index of particular character ni the string
        String str8 = "ritesh";
        System.out.println(str8.indexOf('t'));   // if it returns -1 then char not present in the string; 

        // 14) charArray to string
        char[] arr = {'a', 'b', 'c'};
        String str9 = String.valueOf(arr);
        System.out.println(str9.getClass());


        // 15) substring
        String str10 = "ritesh";
        System.out.println(str10.substring(1));

    }
}
