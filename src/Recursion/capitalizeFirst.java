/*
 capitalizeFirst

 Write a recursive function called capitalizeFirst.
 Given an array of strings, capitalize the first letter of each string in the array.
 */

package Recursion;

import java.util.Arrays;


public class capitalizeFirst {
    public static void main(String[] args) {
        String[] array1 = {"car", "taco", "banana"};
        String[] array2 = {"wheel", "carrot", "apple"};
        
        int index1 = 0;
        int index2 = 0;

        capitalizeFirst(array1, index1); // Car, Taco, banana
        write(array1);
        capitalizeFirst(array2, index2); // Wheel, carrot, Apple 
        write(array2);   
    }
    
    public static void capitalizeFirst(String array[], int index){
        if (index == array.length) {
            return;
        }else{
            String s = String.valueOf(array[index].charAt(0));
            s = s.toUpperCase();     
            s += array[index].substring(1);
            array[index] = s;
            
        }
        index++;
        capitalizeFirst(array, index);   
    }
    
    public static void write(String[] str){
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
