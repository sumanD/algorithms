package geeksofgeeks.flipkart;

/**
 * A long array A[] is given to you.
 * There is a sliding window of size w which is moving from the very left of the array to the very right.
 * You can only see the w numbers in the window. Each time the sliding window moves rightwards by one position.
 * You have to find the maximum for each window. The following example will give you more clarity.
 *
 * Example :

 The array is [1 3 -1 -3 5 3 6 7], and w is 3.

 Window position	Max

 [1 3 -1] -3 5 3 6 7	3
 1 [3 -1 -3] 5 3 6 7	3
 1 3 [-1 -3 5] 3 6 7	5
 1 3 -1 [-3 5 3] 6 7	5
 1 3 -1 -3 [5 3 6] 7	6
 1 3 -1 -3 5 [3 6 7]	7

 Input: A long array A[], and a window width w
 Output: An array B[], B[i] is the maximum value of from A[i] to A[i+w-1]
 Requirement: Find a good optimal way to get B[i]

 Algorithms #1 :
 ==============
 1. Use two for loops , 1 for looping through the array and another to find out the maximum within the window
 2. Store the maximums in an array

 Time Complexity :
 ===============
 O(nw) - As two for loops are required

 */
public class SlidingWindowMaximum {


    // Time Complexity - O(nw) as two for loops are used
    private int[] calculateMaxSlidingWindows(int input[], int windowSize) {
        int maxSlidingWindows [] = new int[input.length];

        // Input array is empty, So we can not find the desired result
        if(input.length == 0) {
            System.out.println("Input array size is 0. Invalid input data provided");
            return maxSlidingWindows;
        }

        // Window Size should be >=1
        if(windowSize <= 0) {
            System.out.println("Window size should be 1<=windowSize<=input.length");
            return maxSlidingWindows;
        }

        // If window size is greater than the input array size then returning the maximum of the input array
        if(windowSize >= input.length) {
            int maxWindow = 0;
            for(int i=0;i<input.length;i++) {
                if(input[i] > maxWindow) {
                    maxWindow = input[i];
                }
            }
            maxSlidingWindows[0] = maxWindow;
            return maxSlidingWindows;
        }

        // When window size is less that the input array size

        /**
         *  Time Complexity :
         *  =================
         *
         *  Outer loop runs for [input.length - windowSize + 1], i.e., O(n-w+1)
         *  Inner Loop runs for [windowSize - 1] for each run of outer loop, i.e., O(w)
         *
         *  Hence total time = O(n-w+1) * O(w) = O((n-w+1)*w) = O(nw)
         *
         */

        int maxLoop = 0;
        for(int i=0; i+windowSize <= input.length ; i++) {
            int maxWindow = 0;

            for(int j=i; j < i+windowSize ; j++) {
                if(input[j] > maxWindow) {
                    maxWindow = input[j];
                }
            }
            maxSlidingWindows[i] = maxWindow;
            maxLoop = i;
        }
        System.out.println("#Of Loops = " + maxLoop +", Input array Size = " + input.length + ", Window Size = " + windowSize);
        return maxSlidingWindows;
    }

    private void printMaxSlidingWindow(int [] maxSlidingWindow) {
        System.out.println("Max Sliding Window .......");

        for(int i=0;i<maxSlidingWindow.length;i++) {
            if(maxSlidingWindow[i] != 0) {
                System.out.print(maxSlidingWindow[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int input [] = {1,3,-1,-3,5,3,6,7};
        int windowSize = 3;

        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();
        int maxSlidingWindow [] = slidingWindowMaximum.calculateMaxSlidingWindows(input,windowSize);

        slidingWindowMaximum.printMaxSlidingWindow(maxSlidingWindow);
    }
}
