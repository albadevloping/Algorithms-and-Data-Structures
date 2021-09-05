/*
 Frequency Counter - validAnagram
 Given two strings, write a function to determine if the second string is
 an anagram of the first. An anagram is a word, phrase, or name formed
 by rearranging the letters of another, such as cinema, formed from iceman.
 Note: You may assume the string contains only lowercase alphabets.

 Time Complexity - O(n)

*/

package ProblemSolvingPatterns.FrequencyCounterPatterns;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "cat")); // false
        System.out.println(isAnagram("awesome", "awesom")); // false
        System.out.println(isAnagram("qwerty", "qeywrt")); // true
    }

    public static boolean isAnagram(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            // value of c key != null
            if (map.get(c) != null) {
                map.put(c, +1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < word2.length(); i++) {
            char c = word2.charAt(i);
            if (map.get(c) != null) {
                map.put(c, -1);
            } else {
                return false;
            }
        }
        return true;
    }

}
