/*
 Sliding Window - maxSubarraySum
 Given an array of integers and a number, write a function called maxSubarraySum,
 which finds the maximum sum of a subarray with the length of the number passed to the function.

 Note that a subarray must consist of consecutive elements from the original array.
 In the first example below, [100, 200, 300] is a subarray of the original array, but [100, 300] is not.
 

 Constraints:
 Time Complexity - O(N)
 Space Complexity - O(1)
 */

package ProblemSolvingPatterns.SlidingWindow;


public class maxSubarraySum {
    public static void main(String[] args) {
        int[] array1 = {100,200,300,400}; int num1 = 2; // 700
        int[] array2 = {1,4,2,10,23,3,1,0,20}; int num2 = 4; // 39
        int[] array3 = {-3,4,0,-2,6,-1}; int num3 = 2; // 5
        int[] array4 = {3,-2,7,-4,1,-1,4,-2,1}; int num4 = 2; // 5
        int[] array5 = {2,3}; int num5 = 3; // 0
        
        System.out.println(maxSubarraySum(array1, num1));
        System.out.println(maxSubarraySum(array2, num2));
        System.out.println(maxSubarraySum(array3, num3));
        System.out.println(maxSubarraySum(array4, num4));
        System.out.println(maxSubarraySum(array5, num5));
     
    }
    public static int maxSubarraySum(int[] array, int num){
        if(array.length == 0 || num > array.length)
            return 0;
            
        int maxSum = 0;
        int temp = 0;
        
        
        for (int i = 0; i < num; i++) {
            maxSum += array[i]; 
        }
        
        temp = maxSum;
        
        for (int i = num; i < array.length; i++) {
            temp =  temp - array[i - num] + array[i];
            maxSum = Math.max(maxSum, temp);
        }
        
        return maxSum;
        
    }
}
