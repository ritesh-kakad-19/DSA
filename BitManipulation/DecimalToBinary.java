package BitManipulation;

public class DecimalToBinary {
    public static void main(String[] args) {
        

        int n = 10;
        int binary = 0;
        int power = 0;

        while(n > 0)
        {
            int rem = n % 2;
            binary = binary + (rem * Math.powExact(10, power));
            power++;
            n = n/2;
        }

        System.out.println(binary);
    }
}
