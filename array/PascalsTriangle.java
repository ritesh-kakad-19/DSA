package array;
import java.util.*;

// print pascals triangle:
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1

public class PascalsTriangle {
    public static void main(String[] args) {
        
        List <List<Integer>> ls = new ArrayList<>();
        int n = 5;

        //pascalsTriangle(n);
        //approach2(ls, n);
        approach3(1);
    }


    // using 2D arrays
    public static void pascalsTriangle( int n)
    {
        int arr[][] = new int [n][n];

        // create and print pascals triangle
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                if(j==0 || j == i)
                {
                    arr[i][j] = 1;
                    System.out.print( arr[i][j]+" ");
                }
                else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    System.out.print( arr[i][j]+" ");
                }
            }
            System.out.println();
            
        }
    }


    // using nested list
    public static void approach2(List<List<Integer>> ls, int n)
    {
        // create the triangle
        for(int i=0; i<n; i++)
        {
            List <Integer> row = new ArrayList<>();

            for(int j=0; j<=i; j++)
            {
                if(j == 0 || j == i)
                {
                    row.add(j, 1);
                }
                else{
                    int value = ls.get(i-1).get(j-1) + ls.get(i-1).get(j);
                    row.add(value);
                }
            }
            ls.add(row);
        }

        // print the triangle
        for(List<Integer> row : ls)
        {
            System.out.println(row);
        }
    }


    // using single list print the specific row of given index of the triangle
    public static void approach3(int index )
    {
        List <Integer> row = new ArrayList<>();
        row.add(1);
        for(int i=1; i<=index; i++)
        {
            for(int j=i; j>0; j--)
            {
                if(j==i)
                {
                    row.add(1);
                }
                else{
                    int value = row.get(j-1) + row.get(j);
                    row.set(j, value);
                    
                }
            }
        }

        System.out.println(row);
    }
}
