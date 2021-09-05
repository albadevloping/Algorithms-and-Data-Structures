/*
 Multiple Pointers - isSubsequence
 Write a function called isSubsequence which takes in two strings and checks
 whether the characters in the first string form a subsequence of the characters
 in the second string. In other words, the function should check whether the characters
 in the first string appear somewhere in the second string, without their order changing.

 Your solution MUST have AT LEAST the following complexities:
 Time Complexity - O(N + M)
 Space Complexity - O(1)
 
*/

package ProblemSolvingPatterns.MultiplePointersPatterns;


public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("hello","hello word")); // true
        System.out.println(isSubsequence("sing","sting")); // true
        System.out.println(isSubsequence("abc","abracadabra")); // true
        System.out.println(isSubsequence("abc","acb")); // false (order matters)
        System.out.println(isSubsequence("alba","abla")); // false (order matters)
        System.out.println(isSubsequence("mesa","silla")); // false
    }
    
    public static boolean isSubsequence(String pattern, String word){
        if(pattern.length() == 0 || word.length() == 0)
            return false;
        if(word.length() < pattern.length())
            return false;
        
        int i = 0;
        int j = 0;
        
        while(i < pattern.length() && j < word.length()){
            if(pattern.charAt(i) == word.charAt(j)){
                i++;
            }
            j++;    
        }
        return i == pattern.length();    
    }
}
