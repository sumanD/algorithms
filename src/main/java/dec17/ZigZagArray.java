package dec17;


/**
 * Convert array into Zig-Zag fashion
 *
 Given an array of distinct elements, rearrange the elements of array in zig-zag fashion in O(n) time.
 The converted array should be in form a < b > c < d > e < f.

 Example:
 Input:  arr[] = {4, 3, 7, 8, 6, 2, 1}
 Output: arr[] = {3, 7, 4, 8, 2, 6, 1}

 Input:  arr[] =  {1, 4, 3, 2}
 Output: arr[] =  {1, 4, 2, 3}
 */
public class ZigZagArray {


    static int [] arr = new int[] {4,3,7,8,6,2,1};

    /**
     * Using extended Bubble Sort.
     * Using a flag to determine the last and next zig-zag operation, i.e., < or > operation.
     * @param arr Input Array
     */
    public  void reArrange(int [] arr) {

        int len = arr.length;

        if(len <1) {
            return;
        }

        // Using extended Bubble Sort
        boolean flag = true; // True means < & False means >

        for(int i=0; i < len-1 ; i++ ){


            if(flag) {
                if(arr[i] > arr[i+1]) {
                    int tmp = arr[i + 1];
                    arr[i+1] = arr[i];
                    arr[i] = tmp;
                }
            }
            else {
                if(arr[i] < arr[i+1]) {
                    int tmp = arr[i + 1];
                    arr[i+1] = arr[i];
                    arr[i] = tmp;
                }
            }

            flag = !flag;
        }
    }

    public static void main(String[] args) {
        ZigZagArray zigZagArray = new ZigZagArray();
        zigZagArray.reArrange(arr);

        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
