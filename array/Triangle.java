package array;

import java.util.*;

public class Triangle {
    public static void main(String[] args) {
        
        List<List<Integer>> ls = new ArrayList<>();

        shortestPath(ls, 5);
    }

    public static void shortestPath( List<List<Integer>> ls, int n)
    {
        for(int i=0; i<n; i++)
        {
            List <Integer> row = new ArrayList<>();
            for(int j=0; j<= i; j++)
            {
                row.add(j);
            }
            ls.add(row);
        }

        System.out.println(ls);

        List<Integer> list = new ArrayList<>();
    }
}
