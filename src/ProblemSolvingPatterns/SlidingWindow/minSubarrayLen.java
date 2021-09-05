/*
 Sliding Window - minSubArrayLen
 Write a function called minSubArrayLen which accepts two parameters -
 an array of positive integers and a positive integer.

 This function should return the minimal length of a contiguous subarray
 of which the sum is greater than or equal to the integer passed to the function.
 If there isn't one, return 0 instead.

 Time Complexity - O(n)
 Space Complexity - O(1)
 */

package ProblemSolvingPatterns.SlidingWindow;

import java.lang.Integer;

public class minSubarrayLen {
    public static void main(String[] args) {
        int[] array1 = {2,3,1,2,4,3}; int num1 = 7; // 2 -> because [4,3] is the smallest subarray
        int[] array2 = {2,1,6,5,4}; int num2 = 9; // 2 -> because [5,4] is the smallest subarray
        int[] array3 = {3,1,7,11,2,9,8,21,62,33,19}; int num3 = 52; // 1 -> because [62] is greater than 52 
        int[] array4 = {1,4,16,22,5,7,8,9,10}; int num4 = 39; // 3
        int[] array5 = {1,4,16,22,5,7,8,9,10}; int num5 = 55; // 5
        int[] array6 = {4,3,3,8,1,2,3}; int num6 = 11; // 2
        int[] array7 = {1,4,16,22,5,7,8,9,10}; int num7 = 95; // 0

        System.out.println(maxSubarraySum(array1, num1));
        System.out.println(maxSubarraySum(array2, num2));
        System.out.println(maxSubarraySum(array3, num3));
        System.out.println(maxSubarraySum(array4, num4));
        System.out.println(maxSubarraySum(array5, num5));
        System.out.println(maxSubarraySum(array6, num6));
        System.out.println(maxSubarraySum(array7, num7));     
    }
    public static int maxSubarraySum(int[] array, int num){    
        int total = 0;
        int start = 0;
        int end = 0;
        int minLen = Integer.MAX_VALUE;
        
        while(start < array.length){
            //if current window doesn't add up to the given
            //sum, move the window to right
            if(total < num && end < array.length){
                total += array[end];
                end++;
            }
            //if current window doesn't add up to the given
            //sum, we can shrink the window
            else if(total >= num){
                minLen = Math.min(minLen, end-start);
                total -= array[start];
                start++;
            }
            //current total less than required total but
            //we reach the end
            else
                break;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
