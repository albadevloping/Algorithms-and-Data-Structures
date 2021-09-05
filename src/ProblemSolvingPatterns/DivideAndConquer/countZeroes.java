/*
 Divide and Conquer - countZeroes
 Given an array of 1s and 0s which has all 1s first followed by all 0s,
 write a function called countZeroes, which returns the number of zeroes in the array.

 Time Complexity - O(log n)
 */

package ProblemSolvingPatterns.DivideAndConquer;


public class countZeroes {
    public static void main(String[] args) {
        int[] array1 = {1,1,1,1,0,0}; // 2
        int[] array2 = {1,0,0,0,0}; // 4
        int[] array3 = {0,0,0}; // 3
        int[] array4 = {1,1,1,1}; // 0
        
        System.out.println(countZeroes(array1));
        System.out.println(countZeroes(array2));
        System.out.println(countZeroes(array3));
        System.out.println(countZeroes(array4));        
    }
    
    public static int countZeroes(int[]array){
        int left = 0;
        int right = array.length-1;
        
        while(left <= right){
            int middle = (left + right) / 2;
            
            if(array[middle] == 1){
                left = middle +1;
            }else{
                right = middle -1;
            }
        }     
        return array.length - left;
    }
}
