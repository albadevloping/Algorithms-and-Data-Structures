/*
 capitalizeWords

 Write a recursive function called capitalizeWords.
 Given an array of words, return a new array containing each word capitalized.
 */

package Recursion;


public class capitalizeWords {
    public static void main(String[] args) {
        String[] array1 = {"i", "am", "learning", "recursion"};
        String[] array2 = {"and", "practicing", "good", "code"};
     

        capitalizeWords(array1, 0); // I, AM, LEARNING, RECURSION
        write(array1);
        capitalizeWords(array2, 0); // AND, PRACTICING, GOOD, CODE 
        write(array2);   
    }
    
    public static void capitalizeWords(String array[], int index){
        if (index == array.length) {
            return;
        }else{
            String s = String.valueOf(array[index]);
            s = s.toUpperCase();
            array[index] = s;    
        }
        index++;
        capitalizeWords(array, index);   
    }
    
    public static void write(String[] str){
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println("");
    }
}
