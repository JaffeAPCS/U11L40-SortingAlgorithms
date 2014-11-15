
/**
 * Write a description of class SelectionSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectionSort
{
    /**
     * Selection sort
     * 
     * @param  arr The array to sort
     * @return     The sorted array 
     */
    public static int[] sort(int[] arr)
    {
        // min will hold the minimum value, minIndex will have the index of the value
        int min, minIndex;
        
        // Go through the array
        for (int i = 0; i < arr.length; i++) {
            // For each scan through the array save the first value and the index
            min = arr[i];
            minIndex = i;
            
            // Scan through the rest of the elements to find there is a value that's 
            // less than the first one
            for (int j = i+1; j < arr.length; j++) {
                
                // Found a new minimum.  Save the value and index
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            // We've scanned the rest of the array.  Swap the minimum value
            // with the first element of this scan
            arr[minIndex] = arr[i];
            arr[i] = min;
            
            // Prints the current array for debuggin
            SelectionSort.printArray(arr);
        }
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
