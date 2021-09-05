/*
 Binary Search

 Write a function called binarySearch which accepts a sorted array and
 a value and returns the index at which the value exists. Otherwise, return -1.

 Time Complexity - O(log n)

 */

package SearchingAlgorithms;

import java.util.Arrays;


public class binarySearch {
    public static void main(String[] args) {
        int[] array1 = {10,15,20,25,30}; int num1 = 15; // 1
        int[] array2 = {1,2,3,4,5}; int num2 = 4; // 3
        int[] array3 = {100}; int num3 = 100; // 0
        int[] array4 = {1,2,3,4,5}; int num4 = 5; // 4
        int[] array5 = {1,2,3,4,5}; int num5 = 6; // -1
        int[] array6 = {100}; int num6 = 200; // -1
        int[] array7 = {5,6,10,13,14,18,30,34,35,37,40,
                        44,64,79,80,86,90}; int num7 = 10; // 2
        int[] array8 = {5,6,10,13,14,18,30,34,35,37,40,
                        44,64,79,80,86,90}; int num8 = 86; // 15
        int[] array9 = {5,6,10,13,14,18,30,34,35,37,40,
                        44,64,79,80,86,90}; int num9 = 91; // -1

        System.out.println(linearSearch(array1, num1));
        System.out.println(linearSearch(array2, num2));
        System.out.println(linearSearch(array3, num3));
        System.out.println(linearSearch(array4, num4));
        System.out.println(linearSearch(array5, num5));
        System.out.println(linearSearch(array6, num6));
        System.out.println(linearSearch(array7, num7));
        System.out.println(linearSearch(array8, num8));
        System.out.println(linearSearch(array9, num9));

    }
    
    public static int linearSearch(int[] array, int value){
        int left = 0;
        int right = array.length-1;
        
        while(left <= right){
            int middle = (left + right)/2;
            
            if (value == array[middle]) {
                 return middle;
            }
            
            if (value < array[middle]) {
                right = middle-1;    
            }else{
                left = middle+1;
            }
        }
        return -1;
    }

}
