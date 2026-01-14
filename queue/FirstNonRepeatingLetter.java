package queue;

import java.util.*;

public class FirstNonRepeatingLetter {
    public static void main(String[] args) {
        String str = "aabccxbe";
        Queue <Character> q = new LinkedList<>();
        int freqArray[] = new int [26];
        char nonRepeatingLetters[] = new char[str.length()];


        
        for(int i = 0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            int index = ch - 'a';
            freqArray[index] = freqArray[index] + 1;
            q.offer(ch);

            while(!q.isEmpty() && freqArray[q.peek()-'a'] > 1)
            {
                q.poll();
            }
            if(q.isEmpty())
            {
                nonRepeatingLetters[i] = '0';
            }
            else
            {
                nonRepeatingLetters[i] = q.peek();
            }

        }

        System.out.println("first non repeating letter in a string: "+ nonRepeatingLetters[nonRepeatingLetters.length-1]);

        // print first non repeating letter array
        for(int i=0; i<nonRepeatingLetters.length; i++)
        {
            System.out.print(nonRepeatingLetters[i] +" ");
        }
    }
}
