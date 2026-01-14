

public class SearchMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},
                       {10,11,16,20},
                       {23,30,34,60}};

        int target = 24;
 
        search(arr, target);
    }

    public static void search(int arr[][], int target)
    {
        int startRow = 0;
        int endRow = arr.length-1;
        int startCol = 0;
        int endCol = arr[0].length-1;

        while(startRow <= endRow && endCol >= startCol)
        {
            if(arr[startRow][endCol] == target)
            {
                System.out.println(startRow+" "+endCol);
                return;
            }

            if(target < arr[startRow][endCol])
            {
                endCol--;
            }
            else{
                startRow++;
            }

        }

        System.out.println("not found");
        return;
    }
}
