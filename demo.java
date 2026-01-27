import java.util.*;

public class demo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
		// your code goes here
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		
		switch(ch){
		case 'a':
		    System.out.println("vowel");
		    break;
		case 'e':
		    System.out.println("vowel");
		    break;
		case 'i':
		    System.out.println("vowel");
		    break;
		case 'o':
		    System.out.println("vowel");
		    break;
		case 'u':
		    System.out.println("vowel");
		default:
		    System.out.println("consonant");
		    break;
		}
    }
    
}
