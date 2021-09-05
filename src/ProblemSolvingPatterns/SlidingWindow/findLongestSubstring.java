/*
 Sliding Window - findLongestSubstring
 Write a function called findLongestSubstring, which accepts a string and
 returns the length of the longest substring with all distinct characters.

 Time Complexity - O(n)
 */

package ProblemSolvingPatterns.SlidingWindow;

import java.util.HashMap;


public class findLongestSubstring {
    public static void main(String[] args) {
        String str1 = ""; // 0
        String str2 = "rithmschool"; // 7
        String str3 = "thisisawesome"; // 6
        String str4 = "thecatinthehat"; // 7
        String str5 = "bbbbbb"; // 1
        String str6 = "longestsubstring"; // 8
        String str7 = "thisishowwedoit"; // 6

        System.out.println(findLongestSubstring(str1));
        System.out.println(findLongestSubstring(str2));
        System.out.println(findLongestSubstring(str3));
        System.out.println(findLongestSubstring(str4));
        System.out.println(findLongestSubstring(str5));
        System.out.println(findLongestSubstring(str6));
        System.out.println(findLongestSubstring(str7));     
    }
    
    public static int findLongestSubstring(String str){
        if(str == "")    
            return 0;
        
        int start = 0;
        int longest = 0;
        HashMap<Character, Integer> seen = new HashMap<Character, Integer>();
        

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!seen.isEmpty()) {
                if (seen.get(c) != null && seen.get(c) != 0) {
                    start = Math.max(start, seen.get(c));
                }
            }
            // index - beginning of substring + 1 (to include current in count)
            longest = Math.max(longest, i - start + 1);
            // store the index of the next char so as to not double count
            seen.put(c, i+1);
        }
        return longest;
    }
}
