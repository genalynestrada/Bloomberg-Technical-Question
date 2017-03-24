import java.util.ArrayList;

/**
 * Created by Genalyn Estrada on 24/03/17.
 */
public class StockPrice {
    public static void main (String[] args){
        int [] i = {10,20,30,40,50,60};
        System.out.print(Solution(i, 3));
    }

    public static ArrayList<Integer> Solution (int [] prices, int mValue) {
        ArrayList<Integer> movingAverage = new ArrayList<Integer>();
        int baseClause = 0;

        //Compute the average of the first mValue numbers
        for (int i = 0; i <= mValue - 1; i++) {
            baseClause += prices[i];
        }

        movingAverage.add(baseClause/mValue);
        int inductionClause = baseClause;

        //Compute the average of the rest of the array
        for (int i = 0; i <= (prices.length - mValue - 1); i++) {
            inductionClause = (prices[mValue + i] + (inductionClause - prices[i]));
            movingAverage.add(inductionClause/mValue);
        }
        return movingAverage;
    }
}

