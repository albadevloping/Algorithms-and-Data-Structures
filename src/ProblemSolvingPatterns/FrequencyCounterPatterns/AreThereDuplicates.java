/*
 Frequency Counter - areThereDuplicates
 Implement a function called areThereDuplicates which accepts a variable number of arguments,
 and checks whether there are any duplicates among the arguments passed in.
 
 we have assumed that the parameter passed is a string. You can specify the type of argument
 adding a second arg to the function saying the type of literal.

 Restrictions: Time Complexity - O(n), Space Complexity - O(n)
 */

package ProblemSolvingPatterns.FrequencyCounterPatterns;

import java.util.ArrayList;
import java.util.Collection;
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
        
        System.out.println(areThereDuplicates(list1)); 
        System.out.println(areThereDuplicates(list2));
        
    }
    
    public static boolean areThereDuplicates(ArrayList<String> args){
        if(args.size() == 0)
            return false;
       
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (String arg : args){            
            if(map.get(arg) != null){
                map.put(arg, map.get(arg)+1);
            }else{
                map.put(arg, 1);
            }
        }
        
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            if(value > 1)
                return true;
        }
        return false;
        
    }
}
