package chegg.apr18.q8;

import chegg.mar18.q30.HashMap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab7 {

    /**
     * Method to process the trade/share related data provided in the CSV file
     *
     * @param csvFileName
     * @return
     */
    public static HashMap<String, ShareList> processTrades(String csvFileName) {
        // Using Scanner to read the CSV file content
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(csvFileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        final HashMap<String, ShareList> shareGroupMap = new HashMap<>();

        while (scanner.hasNext()) {
            // Getting each line one by one
            String line = scanner.nextLine();

            // Parsing the data
            String[] data = line.trim().split(",");

            // 0th element is Trader name
            String traderName = data[0];

            // 1st element is BUY or SELL Operation
            String buyOrSell = data[1];

            // 2nd element is the quantity of the share
            Integer quantity = new Integer(data[2]);

            // 3rd element is the Share Symbol
            String tickerSymbol = data[3];

            // Fetching the ShareList for the trader from the shareGroupMap
            ShareList shareList = shareGroupMap.get(traderName);

            // If there is no data yet present for a trader then creating a new ShareList object to store
            // Share for that trader
            if (shareList == null) {
                shareList = new ShareList(traderName, new ArrayList<>());
            }

            // Creating a single share object
            Share share = new Share(buyOrSell, quantity, tickerSymbol);

            // Adding it to trader's share list
            shareList.add(share);

            // updating the map
            shareGroupMap.put(traderName, shareList);

        }
        return shareGroupMap;
    }
}
