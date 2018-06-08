package extra.jbmay18;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        areAnagrams("a", "b");
    }

    public static boolean areAnagrams(String first, String second) {
       if(first.length() != second.length()) return false;

       int [] frequencies = new int[26];

       for(int i=0; i<first.length(); i++) {
           int n = first.charAt(i);
           System.out.println(first.charAt(i) + " = " +n );
           System.out.println(first.charAt(i) - 'A');

           frequencies[first.charAt(i) - 'A'] ++;
       }

        System.out.println(Arrays.toString(frequencies));

       return true;
    }
}
