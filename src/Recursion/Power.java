/*
 power

 Write a function called power which accepts a base and an exponent.
 The function should return the power of the base to the exponent.
 This function should mimic the functionality of Math.pow().
 Do not worry about negative bases and exponents.

 */

package Recursion;


public class Power {
    public static void main(String[] args) {
        System.out.println(power(5, 2)); // 25
        System.out.println(power(8, 2)); // 64      
    }
    
    public static int power(int base, int power){
        if(power == 0)
            return 1;
        else{
            return base * power(base, power-1); 
        }
    }
}
