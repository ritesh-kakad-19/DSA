package imp;

public class Fibonnacci {
    public static void main(String[] args) {
        printFibonnacci(50);
    }

    public static void printFibonnacci(int key)
    {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");

        int c = 0;
        while( c <= key)
        {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
