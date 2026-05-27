public class IndianCoins {
    public static void main(String[] args) {
        int coins[] = {83,186,408, 419};
        int value = 6249;

        findMinCoins(coins, value);
    }


    public static void findMinCoins(int coins[], int value){
        
        int minCoins = 0;
        
        int remVal = value;
        for(int i=0; i<coins.length; i++)
        {
            int count = remVal/coins[i];
            if( remVal > 0 && coins[i] <= remVal && count >= 1)
            {
                minCoins += count;
                remVal -= count*coins[i];
            }
        }

        System.out.println(minCoins);
        System.out.println(remVal);
    }
}
