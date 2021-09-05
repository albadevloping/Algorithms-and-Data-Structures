/*
 productOfArray

 Write a function called productOfArray which takes in an array of numbers
 and returns the product of them all.
 */

package Recursion;

import java.util.Arrays;


public class productOfArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3}; int end1 = array1.length-1; // 6
        int[] array2 = {1,2,3,10}; int end2 = array2.length-1; // 60
        
        System.out.println(productOfArray(array1, end1));
        System.out.println(productOfArray(array2, end2));
    }
    
    public static int productOfArray(int[] array, int end){
        if(end == 0)
            return array[0];
        else{
            return array[end] * productOfArray(array, end-1);
        }
    }
}
