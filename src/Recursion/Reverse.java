/*
 reverse

 Write a recursive function called reverse
 which accepts a string and returns a new string in reverse.

 */

package Recursion;


public class Reverse {
    public static void main(String[] args) {
        String str1 = "awesome";
        String str2 = "rithmschool";
        System.out.println(reverse(str1)); // emosewa
        System.out.println(reverse(str2)); // loohcsmhtir
    }
    
    public static String reverse(String str){
        if(str.length() <= 1){
            return str;
        }else{
            System.out.print(str.charAt(str.length()-1));
            return reverse(str.substring(0,str.length()-1));
        }
    }
}
