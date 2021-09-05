/*
 Multiple Pointers - countUniqueValues
 Implement a function called countUniqueValues, which accepts a sorted array,
 and counts the unique values in the array.
 There can be negative numbers in the array, but it will always be sorted.

 Time Complexity - O(n)
 Space Complexity - O(n)

 Bonus:
 You must do this with constant or O(1) space and O(n) time.
 */

package ProblemSolvingPatterns.MultiplePointersPatterns;


public class CountUniqueValues {
    public static void main(String[] args) {
        int array1[] = {1,1,1,1,1,2}; // 2
        int array2[] = {1,2,3,4,4,4,7,7,12,12,13}; // 7
        int array3[] = {}; // 0
        int array4[] = {-2,-1,-1,0,1}; // 4

        System.out.println(countUniqueValues(array1));
        System.out.println(countUniqueValues(array2));
        System.out.println(countUniqueValues(array3));
        System.out.println(countUniqueValues(array4));
   
    }
    
    // Using Two Pointers
    public static int countUniqueValues(int[] array){
        int counter = 0;
        
        if (array.length == 0) 
            counter = 0;
  
        for (int i = 0, j = 1; j < array.length; i++, j++) {
            if(array[i] != array[j])
                counter++;    
        }
        return counter;
    }
}
