/*
 Frequency Counter - areThereDuplicates
 Implement a function called areThereDuplicates which accepts a variable number of arguments,
 and checks whether there are any duplicates among the arguments passed in.
 
 we have assumed that the parameter passed is a string. You can specify the type of argument
 adding a second arg to the function saying the type of literal.

 Restrictions: Time Complexity - O(n), Space Complexity - O(n)
 */

package ProblemSolvingPatterns.MultiplePointersPatterns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;


public class AreThereDuplicates {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList();
        ArrayList<String> list2 = new ArrayList();
        
        list1.add("ab");
        list1.add("cd"); // false
        list1.add("jk");
       
        
        list2.add("alba");
        list2.add("skywalker"); // true
        list2.add("alba");
        list2.add("luke");
        
        System.out.println(areThereDuplicates1(list1)); 
        System.out.println(areThereDuplicates1(list2));
        
    }
    // using Two Pointer
    public static boolean areThereDuplicates1(ArrayList<String> args){
        if(args.size() == 0)
            return false;
        
        Collections.sort(args);
        
        for (int i = 0, j = 1; j < args.size()-1; i++, j++) {
            if (args.get(i) == args.get(j)) {
                return true;
            }
        }
        return false;    
    } 
}
