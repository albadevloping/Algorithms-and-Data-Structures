/*
 Divide and Conquer - sortedFrequency
 Given a sorted array and a number, write a function
 called sortedFrequency that counts the occurrences of the number in the array

 Time Complexity - O(log n)
 */

package ProblemSolvingPatterns.DivideAndConquer;


public class sortedFrequency {
    public static void main(String[] args) {
        int[] array1 = {1,1,2,2,2,2,3}; int num1 = 2; // 2
        int[] array2 = {1,1,2,2,2,2,3}; int num2 = 3; // 1
        int[] array3 = {1,1,2,2,2,2,3}; int num3 = 1; // 2
        int[] array4 = {1,1,2,2,2,2,3}; int num4 = -1; // 0
        
        System.out.println(sortedFrequency(array1, num1));
        System.out.println(sortedFrequency(array2, num2));
        System.out.println(sortedFrequency(array3, num3));
        System.out.println(sortedFrequency(array4, num4));  
    }
    public static int sortedFrequency(int[]array, int num){
        int left = 0;
        int right = array.length-1;
        
        while(left <= right){
            int middle = (left + right) / 2;
            
            if(array[middle] == num){
                
            }
        }   
        return array.length - left;
    }
}
