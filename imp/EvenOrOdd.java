package imp;

public class EvenOrOdd {

     public static void main(String[] args) {
        int num = 101;
        int num2 = 50;
        int num3 = 12;

        // approach 1
        if( num % 2 == 0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

        
        // approach 2
        while(num2 > 1){
            num2 = num2 - 2;
        }
        if(num2 == 1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }


        // approach 3
        int temp = num3 / 2;
        int num4 = temp * 2;
        if(num3 == num4){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
     }
}