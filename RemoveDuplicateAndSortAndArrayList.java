import java.util.Arrays;
import java.util.LinkedHashSet;
 
public class RemoveDuplicateAndSortAndArrayList
{
    public static void main(String[] args) throws CloneNotSupportedException 
    {
        //Array with duplicate elements
        Integer[] array = new Integer[] {1, 12, 7, 3, 6, 9, 7, 15, 1, 8, 4, 3, 9, 4, 5};
         
        //This array has duplicate elements
        System.out.println( Arrays.toString(array) );
         
        //Create set from array elements
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(array) );
         
        //Get back the array without duplicates
        Integer[] arrayWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
         
        //Verify the array content
        System.out.println( Arrays.toString(arrayWithoutDuplicates) );
    }
}