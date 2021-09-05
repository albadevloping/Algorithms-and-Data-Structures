/*
 Linear Search
 Write a function called linearSearch which accepts an array and a value,
 and returns the index at which the value exists.
 If the value does not exist in the array, return -1.
 Don't use indexOf to implement this function!

 Time Complexity - O(n)

 */

package SearchingAlgorithms;


public class linearSearch {
    public static void main(String[] args) {
        int[] array1 = {10,15,20,25,30}; int num1 = 15; // 1
        int[] array2 = {9,8,7,6,5,4,3,2,1,0}; int num2 = 4; // 5
        int[] array3 = {100}; int num3 = 100; // 0
        int[] array4 = {1,2,3,4,5}; int num4 = 6; // -1
        int[] array5 = {9,8,7,6,5,4,3,2,1,0}; int num5 = 10; // -1
        int[] array6 = {100}; int num6 = 200; // -1

        System.out.println(linearSearch(array1, num1));
        System.out.println(linearSearch(array2, num2));
        System.out.println(linearSearch(array3, num3));
        System.out.println(linearSearch(array4, num4));
        System.out.println(linearSearch(array5, num5));
        System.out.println(linearSearch(array6, num6));
        
    }
    
    public static int linearSearch(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
