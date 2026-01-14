

public class SetMatrixZeros {
    public static void main(String[] args) {
        int arr[][] = {{1,0,1},
                    {1,1,1},
                    {1,1,0}};

        
        setMatrixZeros(arr);
    }

    public static void setMatrixZeros(int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(arr[i][j] == 0)
                {
                    
                }
            }
        }
    }
}
