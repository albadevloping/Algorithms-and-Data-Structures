/*
 Implement a function called mixInOrder, which accepts two 
 arrays of integers ordered from smallest to largest and returns an array
 that is obtained by mixing the previous two while maintaining the order. 
 It is not worth mixing and ordering later.
 
 Restrictions: Time Complexity - O(n), Space Complexity - O(1)

 */

package ProblemSolvingPatterns.MultiplePointersPatterns;

import java.util.Arrays;


public class MixArraysInOrder {
    public static void main(String[] args) {
      int[] a = {1,2,4,6};
      int[] b = {3,5,8,9};
      System.out.println(Arrays.toString(mixInOrder(a, b)));
    }
  
    public static int[] mixInOrder(int[] a, int[] b){
        int[] mezcla = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int m = 0;

        while(i < mezcla.length && j < a.length && m < b.length){
            if(a[j] < b[m]){
                mezcla[i] = a[j];
                j++;
            }else{
                mezcla[i] = b[m];
                m++;
            }
            i++;
        }
        while(m < b.length){
            mezcla[i] = b[m];
            m++;
            i++;
        }
        return mezcla;
    }
}
