/*
 naive string search
 Write a function which accepts a string and a pattern,
 and counts the number of times the pattern appears in the string.

 Time Complexity - O(n * m)

 */

package SearchingAlgorithms;


public class stringSearch {
    public static void main(String[] args) {
        String str = "hojoklokoklok";
        String pattern = "lok";
        
        System.out.println(stringSearch(pattern, str));
    }
    
    public static int stringSearch(String pattern, String str){
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < pattern.length(); j++) {
                if (str.charAt(i+j) != pattern.charAt(j))
                    break;
                if (j == pattern.length()-1) 
                    count++;
            }
        }
        return count;
    }
}
