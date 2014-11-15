import java.util.*;

/**
 * Write a description of class MergeSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MergeSort
{
    /**
     * Merge sort
     * 
     * @param arr The array to sort
     * @return The sorted array
     */
    public static int[] sort(int[] arr) {
        if (arr.length <= 1) return arr;
        
        int middle = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);
        
        left = sort(left);
        right = sort(right);
        
        MergeSort.printArray(left);
        MergeSort.printArray(right);
        
        return merge(left, right);
    }
    
    /**
     * Merge the left and right arrays
     * 
     * @param left The left half array
     * @param right The right half array
     * @return The array that results when the left and right are merged
     */
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length+right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if ((leftIndex < left.length) && (rightIndex < right.length)) {
                if (left[leftIndex] < right[rightIndex]) {
                    result[i] = left[leftIndex];
                    leftIndex++;
                } else {
                    result[i] = right[rightIndex];
                    rightIndex++;
                }
            } else {
                if (leftIndex >= left.length) {
                    result[i] = right[rightIndex];
                    rightIndex++;
                } else {
                    result[i] = left[leftIndex];
                    leftIndex++;
                }
            }
        }
        return result;
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
