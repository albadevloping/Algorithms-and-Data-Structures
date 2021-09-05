/*
 someRecursive

 Write a recursive function called someRecursive which accepts an array.
 The function returns true if a single value in the array is odd or even. 
 Otherwise return false.

 */

package Recursion;


public class someRecursive {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        int[] array2 = {4,6,8,9};
        int[] array3 = {4,6,8}; 
        int[] array4 = {4,6,8}; 
        
        int index = 0;
        
        System.out.println(someRecursive(array1, index)); // true
        System.out.println(someRecursive(array2, index)); // true
        System.out.println(someRecursive(array3, index)); // false
        System.out.println(someRecursive(array4, index)); // false
    }
    
    public static boolean someRecursive(int[] array, int index){
        if (index == array.length-1) {
            return false;
        }else if(array[index] % 2 == 0 || array[index] % 2 != 0){
            System.out.print(" there are both, even and odd numbers => ");
            return true;
        }
        return someRecursive(array, index++);
    }
}
