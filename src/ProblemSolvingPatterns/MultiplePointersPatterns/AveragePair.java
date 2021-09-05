/*
 Multiple Pointers - averagePair
 Write a function called averagePair. Given a sorted array of integers
 and a target average, determine if there is a pair of values in the array
 where the average of the pair equals the target average.
 There may be more than one pair that matches the average target.

 Bonus Constraints:
 Time Complexity: O(N)
 Space Complexity: O(1)

 */

package ProblemSolvingPatterns.MultiplePointersPatterns;


public class AveragePair {
    public static void main(String[] args) {
        double array1[] = {1,2,3}; double average1 = 2.5; // true
        double array2[] = {1,3,3,5,6,7,10,12,19}; int average2 = 8; // true
        double array3[] = {-1,0,3,4,5,6}; double average3 = 4.1; // false
        double array4[] = {}; int average4 = 4; // false
        
        
        System.out.println(averagePair(array1, average1));
        System.out.println(averagePair(array2, average2));
        System.out.println(averagePair(array3, average3));
        System.out.println(averagePair(array4, average4));

    }
    
    public static boolean averagePair(double[] array1, double average){
        if(array1.length == 0)
            return false;
        
        int left = 0;
        int right = array1.length-1;
        
        while(left < right){
            if(array1[left] + array1[right] / 2.0 == average){
                return true;
            } else if(array1[left] + array1[right] / 2.0 > average){
                right--;
            }
            left++;            
        }
        return false; 
    }
}
