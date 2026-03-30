


import java.util.*;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int arr[][] = {{1,1,1},
                    {1,0,1},
                    {1,1,1}};

        
        setMatrixZeros(arr);
        printMatrix(arr);
    }

    public static void setMatrixZeros(int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;

        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(arr[i][j] == 0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        System.out.println(row);
        System.out.println(col);

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(arr[i][j] != 0)
                {
                    if(row.contains(i))
                    {
                        arr[i][j] = 0;
                    }
                    else if(col.contains(j))
                    {
                        arr[i][j] = 0;
                    }
                }
            }
        }

    }

    public static void printMatrix(int arr[][])
    {
        int n = arr.length;
        int m = arr[0].length;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
}
