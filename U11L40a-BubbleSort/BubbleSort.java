
/**
 * Write a description of class BubbleSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BubbleSort
{
    /**
     * Bubble sort
     * 
     * @param  arr   Array to sort
     * @return The sorted array
     */
    public static int[] sort(int[] arr)
    {
        boolean notFinished;
        do {
            // notFinished will tell us if we need to do another pass through the array
            notFinished = false;
            BubbleSort.printArray(arr);
            
            // Scan the array
            for (int j = 0; j < arr.length-1; j++) {
                
                // If the current element is greater than the next element
                // then it's not in the correct order and we should swap 
                // the values
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    // Since we've had to swap on this pass
                    // let's set this flag so we'll know that we
                    // have to go through the array again
                    notFinished = true;
                
                }
                
            // Do another run through the array if we had to swap
            // at least once during the last run
            }
        } while (notFinished);
        return arr;
    }
    
    /**
     * Prints the array with a column header to the terminal window
     * 
     * @param arr The array to print
     */
    public static void printArray(int[] arr) {
        System.out.printf("%3s %3s\n", "idx", "val");
        for (int i = 0; i < arr.length; i++) 
            System.out.printf("%3d %3d\n", i, arr[i]);
        System.out.println();
    }
}
