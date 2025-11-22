package string;


// print the largest substring of given strings
public class LargestSubstring {
    public static void main(String[] args) {
        //String str = "hello, I am ritesh kakad. I am from sangamner. I am persuing IT engineering from avcoe sangamner.";
        //String str = "hello,Ritesh.Amrutvahini,nayan.i,helloeveryone.this,welcome";
        String str = "Hello Everyone! I am ritesh kakad. My email is- kakadritesh19@gmail.com / mobile no- 9860106813. I am persuing_IT degree."; 

        findLargestString(str);
        largest2(str);


    }

    // brute force approach
    public static void findLargestString(String str)
    {
        String largest = "";

        
        while(str.length() > 0)
        {
            StringBuilder newstr = new StringBuilder();
            int i = 0;

            // storing the substring until , or . appears
            while(i < str.length() && 
                    str.charAt(i) != '.' 
                    && str.charAt(i) != ',' 
                    && str.charAt(i) != '!' 
                    && str.charAt(i) != '@' 
                    && str.charAt(i) != '-' 
                    && str.charAt(i) != '_' 
                    && str.charAt(i) != '/'  )
            {
                newstr = newstr.append(str.charAt(i));
                i++;
            }

            // check the largest substring with current substring 
            if(newstr.length() > largest.length())
            {
                largest = newstr.toString().trim();            // trim removes leading and trailing spaces
            }

            // check the length of substring when no comma or fullstop at the end of string
            if(i == str.length()) break;

            str = str.substring(i+1,str.length());

        }

        System.out.println("largest string: `"+ largest + "` having length: "+ largest.length());
    }



    // 2nd approach
    public static void largest2(String str)
    {
        // Every character inside [] is treated as a separator
        String words[] = str.split("[,.@!_/-]");

        String largest = "";
        for(String w : words)
        {
            w = w.trim();
            if(w.length() > largest.length())
            {
                largest = w;
            }
        }
        System.out.println("largest string: `"+ largest+ "` having length: "+ largest.length() );
    }
}
