
/**
 * Write a description of class InsertionSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InsertionSort
{
    /**
     * Insertion sort
     * 
     * @param arr The array to sort
     * @return The sorted array
     */
    public static int[] sort(int[] arr)
    {
        int itemToInsert, j;
        boolean keepGoing;

        // Our algorithm will start with the first element in the array and
        // then place subsequent elements (index=1 and on) before or after depending 
        // on the order.  This is the "deck of cards" analogy used in the textbook's
        // explanation
        for (int i=1; i<arr.length; i++) {
            itemToInsert = arr[i];
            // Index of where we're currently checking to see if it the item will fit
            j = i-1;
            keepGoing = true;
            
            // Scan through the rest of the list backwards to find the insertion point
            while ((j>=0) && keepGoing) {
                InsertionSort.printArray(arr); // Debug statement...
                if (itemToInsert < arr[j]) {
                // The item does NOT belong here.  Move the current item down to
                // make room for the item that we're placing into the array 
                    arr[j+1] = arr[j];
                    j--;
                    if (j == -1) {
                        arr[0] = itemToInsert;
                    }
                } else {
                    // The item BELONGS in the index just above this one. Put it in...
                    arr[j+1] = itemToInsert;
                    // and stop going through the items.  Go on to the next item to place
                    keepGoing = false;
                }
            }
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
    }
}
