package chegg.apr18.q8;

import chegg.mar18.q30.HashMap;

/**
 * Test Class
 */
public class ApplicationTest {

    public static void main(String[] args) {
        // Calling ProcessTrades() method by passing the CSV file
        HashMap<String, ShareList> map = Lab7.processTrades("trades.csv");

        // Printing the output
        for (String traderName : map.keySet()) {
            ShareList shareList = map.get(traderName);
            System.out.println(shareList);
        }
    }
}
