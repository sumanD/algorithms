package extra.lambda;

public class LambdaTester1 {

    public static void main(String[] args) throws Exception {

        NumberChecker<Integer, Boolean> numberChecker = (number) -> (number >= 0);

        System.out.println("Check for 10 : " + numberChecker.check(10));
        System.out.println("Check for -20 : " + numberChecker.check(-20));

        numberChecker = (number) -> (number %2) == 0;
        System.out.println("EVEN 21 = " + numberChecker.check(21));
        System.out.println("EVEN 20 = " + numberChecker.check(20));

        NumberChecker<String, Boolean> StringChecker = (string) -> (string.length() > 0);

        System.out.println("STRING [ABC] = " + StringChecker.check("ABS"));

        NumberChecker<String, String> reverseStringChecker = (string) -> {

            if(string.isEmpty()) {
                throw new Exception("Empty String");
            }
            String reverse = "" ;

            for(int i=string.length() -1; i>=0; i--) {
                reverse += string.charAt(i);
            }
            return reverse;
        };

        String reverse = reverseStringChecker.check("Lambda");
        System.out.println("Reverse of Lambda = " + reverse);

        reverse = reverseStringChecker.check("");
        System.out.println("Reverse of '' = " + reverse);

    }
}
