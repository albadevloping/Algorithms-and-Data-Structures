/*
 Frequency Counter - sameFrequency
 Write a function called sameFrequency. Given two positive integers,
 find out if the two numbers have the same frequency of digits.

 Your solution MUST have the following complexities: 
 
 Time: O(N)

*/

package ProblemSolvingPatterns.FrequencyCounterPatterns;

import java.util.HashMap;


public class SameFrequency {
    public static void main(String[] args) {
        System.out.println(sameFrequency(182,281)); //true
        System.out.println(sameFrequency(34,14)); //false
        System.out.println(sameFrequency(3589578,5879385)); //true
        System.out.println(sameFrequency(22,222)); //false
    }
 
    public static boolean sameFrequency(int one, int two){
        
        String num1 = String.valueOf(one);
        String num2 = String.valueOf(two);

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        if(num1.length() != num2.length()){
            return false;
        }
        
        for (int i = 0; i < num1.length(); i++) {
            char c = num1.charAt(i);
            Integer result = map.get(c) != null ? map.put(c, +1) : map.put(c, 1);

        }
        for (int i = 0; i <num2.length() ; i++) {
            char c = num2.charAt(i);
            if(map.get(c) != null){
                map.put(c, -1);
            }else{
                return false;
            }
        }
        return true;
    }
}
