
/**
 * Write a description of class Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Runner
{
    /**
     * Runs the Insertion sort method with a test array
     */
    public static void main() 
    {
        int array[] = {4,2,5,1,3,18,0,9,6};        
        InsertionSort.sort(array);
        InsertionSort.printArray(array);
    }
}
