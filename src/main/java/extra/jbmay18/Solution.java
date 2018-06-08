package extra.jbmay18;

import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        String[] magazineItems = scanner.nextLine().split(" ");

        String[] ransomItems = scanner.nextLine().split(" ");

        scanner.close();

        Map<String, Integer> magazineMap = new HashMap(m);

        for (int i = 0; i < m; i++) {
            Integer value = magazineMap.get(magazineItems[i]);

            if (value == null) {
                value = 1;
            } else {
                value++;
            }
            magazineMap.put(magazineItems[i], value);
        }

        boolean isFound = true;
        for (String ransomNote : ransomItems) {
            Integer value = magazineMap.get(ransomNote);
            if (value != null) {
                value--;

                if (value == 0) {
                    magazineMap.remove(ransomNote);
                }
            } else {
                isFound = false;
                break;
            }
        }

        System.out.print(isFound == true ? "Yes" : "No");
    }
}
