public class ReverseWordsOfString {
    public static void main(String[] args) {
        String s = " hello world ";
        
        
        s = s.trim().replaceAll("\\s+", " ");
        String arr[] = s.split(" ");
        

        int i=0;
        int j=arr.length-1;

        while(i<j)
        {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        
        String result = "";
        for(int k=0; k<arr.length; k++)
        {
            result = result+" "+arr[k];
        }

       System.out.println(result.trim());
    }
}
