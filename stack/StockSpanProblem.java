package stack;
import java.util.*;

public class StockSpanProblem {
    public static void main(String[] args) {
        int stock[] = {100, 80, 60 ,70, 60, 85, 100, 120, 100, 80, 110, 130};
        stockSpan(stock);
    }

    // find the span array of the stocks
    public static void stockSpan(int stock[])
    {
        Stack <Integer> s = new Stack<>();
        int span[] = new int[stock.length];

        span[0] = 1;         // for the first element of the stock array
        s.push(0);
        for(int i = 1; i< stock.length; i++)
        {
            while(!s.isEmpty() && stock[s.peek()] <= stock[i] )
            {
                s.pop();
            }

            if(s.isEmpty())
            {
                span[i] = i+1;
                s.push(i);
            }
            
            if( stock[s.peek()] > stock[i])
            {
                span[i] = i-s.peek();
                s.push(i);
            } 
        }


        // print the span array
        for(int i=0; i<span.length; i++)
        {
            System.out.print(span[i] + " ");
        }
        System.out.println();
    }
}
