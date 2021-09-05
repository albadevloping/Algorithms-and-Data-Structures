/*
 fib

 Write a recursive function called fib which accepts a number
 and returns the nth number in the Fibonacci sequence.
 Recall that the Fibonacci sequence is the sequence of whole numbers 1, 1, 2, 3, 5, 8, ...
 which starts with 1 and 1, and where every number thereafter
 is equal to the sum of the previous two numbers.
 
 */

package Recursion;


public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4)); // 3
        System.out.println(fibonacci(10)); // 55      
        System.out.println(fibonacci(28)); // 317811      
        System.out.println(fibonacci(35)); // 9227465      
    }
    public static int fibonacci(int num){
        if(num < 2){
            return num;
        }else{
            return fibonacci(num - 1) + fibonacci(num - 2);
            
        }
    }
}
