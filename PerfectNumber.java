

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 6;

        int sum = 1;
        for(int i=2; i<num; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }
        System.out.println(sum);

        if(sum == num)
        {
            System.out.println("perfect");
        }
        else{
            System.out.println("not perfect");
        }

    }
}
