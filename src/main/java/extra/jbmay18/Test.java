package extra.jbmay18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void  main(String[] args) throws FileNotFoundException {
        String [] valueArr = new String[10000];
        Scanner scanner = new Scanner(new File("/Users/sdutta1/Documents/workstation/algorithms-practice/trades.csv"));
        scanner.useDelimiter("\n");

        int i=0;
        while(scanner.hasNext()){
            valueArr[i++] = scanner.next();

        }
        scanner.close();

        System.out.println("Size = " + Arrays.toString(valueArr));
    }
}
