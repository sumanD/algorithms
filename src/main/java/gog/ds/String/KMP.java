package gog.ds.String;

public class KMP {
    public static void patternMatch(String txt, String pat) {

        // Txt Pointer
        int i=0;

        // Pattern Pointer
        int j = 0;

        int N = txt.length();
        int M = pat.length();

        int lmp = 0;


        int [] table = new int[M];
        computeLPSArray(pat,M,table);

        while (i < N) {
            //1.

            if(txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
                lmp++;
            }

            if(j == M) {
                System.out.println("Match found @ i = " + i+ " ,j = "+j);
                j= table[j-1];
            }

            else if (i < N && txt.charAt(i) != pat.charAt(j)) {
                if(j == 0) {
                    i++;
                }
                else {
                    j = table[j-1];
                }
            }
        }
      //  System.out.println("No Match Found");
    }

    static void computeLPSArray(String pat, int M, int lps[])
    {
        // length of the previous longest prefix suffix
        int len = 0;
        int i = 1;
        lps[0] = 0;  // lps[0] is always 0

        // the loop calculates lps[i] for i = 1 to M-1
        while (i < M)
        {
            if (pat.charAt(i) == pat.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else  // (pat[i] != pat[len])
            {
                // This is tricky. Consider the example.
                // AAACAAAA and i = 7. The idea is similar
                // to search step.
                if (len != 0)
                {
                    len = lps[len-1];

                    // Also, note that we do not increment
                    // i here
                }
                else  // if (len == 0)
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) {
        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";
        patternMatch (txt,pat);

    }
}
