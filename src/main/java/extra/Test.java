package extra;

public class Test {
    public static void main(String[] args) {
        String [] arr = {"1","2","3","-7"};

        int max = 0, maxSoFar = 0;
        for(String str : arr) {
            maxSoFar += new Integer(str).intValue();


            if(maxSoFar < 0) {
                maxSoFar = 0;
            }
            else if(maxSoFar > max) {
                max = maxSoFar;
            }
        }

        System.out.println("Max-Sum = " + max);
    }
}
