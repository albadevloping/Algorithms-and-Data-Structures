/*
 recursiveRange
 Write a function called recursiveRange which accepts a number
 and adds up all the numbers from 0 to the number passed to the function.

 */

package Recursion;


public class recursiveRange {
    public static void main(String[] args) {
        System.out.println(recursiveRange(6)); // 21
        System.out.println(recursiveRange(10)); // 55      
        System.out.println(recursiveRange(0)); // 55      

    }
    public static int recursiveRange(int num){
        if(num <= 0)
            return 0;
        else{
            return num + recursiveRange(num-1);
        }
    }
}
