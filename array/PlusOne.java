package array;

public class PlusOne {
    public static void main(String[] args) {
        int arr[] = {9,9,9,9};
        
        //approach1(arr);
       int newarray[] = approach3(arr);

        // print the output array
       for(int i=0; i<newarray.length; i++)
       {
            System.out.print(newarray[i]+" ");
       }


    }

    public static void approach1(int arr[])
    {
         // convert array to number
        int result = 0;
        for(int i=0; i<arr.length; i++)
        {
            int num = arr[i];
            result = (result * 10) + num;
        }

       // System.out.println(result);

       // add 1 to number
       result = result + 1;
        
       // convert number to array
       for(int i = arr.length-1; i>0; i--)
       {
            int unit_digit = result % 10;
            arr[i] = unit_digit;
            result = result /10;
       }
       arr[0] = result;

       
    }



    public static int[] approach3(int digits[])
    {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        // if all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
