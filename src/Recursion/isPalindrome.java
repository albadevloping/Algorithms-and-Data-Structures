/*
 isPalindrome

 Write a recursive function called isPalindrome which returns true
 if the string passed to it is a palindrome (reads the same forward and backward).
 Otherwise it returns false.

 */

package Recursion;


public class isPalindrome {
    public static void main(String[] args) {
        String str1 = "awesome";
        String str2 = "foobar";
        String str3 = "tacocat";
        String str4 = "amanaplanacanalpanama";
        String str5 = "amanaplanacanalpandemonium";
        System.out.println(isPalindrome(str1)); // false
        System.out.println(isPalindrome(str2)); // false
        System.out.println(isPalindrome(str3)); // true
        System.out.println(isPalindrome(str4)); // true
        System.out.println(isPalindrome(str5)); // false
    }
    
    public static boolean isPalindrome(String str){
        
        if(!str.substring(0, 1).equals(str.substring(str.length()-1))){
            return false;
        }else if(str.length() <=1){
            return true;
        }else{
            return isPalindrome(str.substring(0+1, str.length()-1));
        }
        
    }
}
