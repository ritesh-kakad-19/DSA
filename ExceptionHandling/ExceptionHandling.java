package ExceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        
        int arr1[] = {10, 50,30,20};
        int arr2[] = {1, 5, 9,0};

        for(int i=0; i<arr1.length; i++)
        {
            System.out.println(divide(arr1[i], arr2[i]));
        }

    }

    public static int divide(int a, int b)
    {
        try{
            return a/b;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return -1;
        }

    }
}
