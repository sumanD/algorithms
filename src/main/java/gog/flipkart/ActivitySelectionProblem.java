package gog.flipkart;

/**
 * You are given n activities with their start and finish times.
 * Select the maximum number of activities that can be performed by a single person,
 * assuming that a person can only work on a single activity at a time.
 *
 * http://www.geeksforgeeks.org/greedy-algorithms-set-1-activity-selection-problem/
 * https://en.wikipedia.org/wiki/Activity_selection_problem
 *
 * Time Complexity :
 * =================
 * O(n) - If the input activities are sorted
 * O(nlogn) - If the input activities are not sorted
 *
 * Algorithm :
 * ===========
 * 1. Sort the finish activities if it is not already sorted
 * 2. Print the first activity
 * 3. Loop through the rest of the activities, check if the current activity start time is greater that last activity finish time
 */
public class ActivitySelectionProblem {

    /**
     * This method print the maximum activity possible. Here end activity array is shorted
     * @param start activity start time
     * @param finish activity finish time
     */
    private void displayMaxActivity(int [] start, int [] finish) {

        if(start.length != finish.length) {
            System.out.println("Incorrect input data provided. Start/End activity array length should be equal.");
            return;
        }

        System.out.print( 0 + "->");

        int lastEndTime = finish[0];

        // Need to check all the items in the end array, hence O(n) time complexity
        for(int i=1;i<finish.length;i++) {
            int startTime = start[i];

            if(startTime > lastEndTime) {
                System.out.print(i + "->");
                lastEndTime = finish[i];
            }
        }
    }

    public static void main(String[] args) {

        int start [] = {1,3,0,5,8,5};
        int finish []   = {2,4,6,7,9,9};

        ActivitySelectionProblem activitySelectionProblem = new ActivitySelectionProblem();
        activitySelectionProblem.displayMaxActivity(start,finish);
    }
}
