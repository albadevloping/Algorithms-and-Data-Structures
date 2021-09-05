/*
 flatten

 Write a recursive function called flatten which accepts an array of arrays
 and returns a new array with all values flattened.

 */

package Recursion;

import java.util.ArrayList;


public class Flatten {
    public static void main(String[] args) {
        int[][] matrix1= { {1,2,3}, 
                           {4,5,6} };
        
        int[][] matrix2= { {1,2}, 
                           {3,4},
                           {5,6} };
        
        int[][] matrix3= { {1}, 
                           {2},
                           {3} };
        
        int[][] matrix4= { {1,2,3} };
        ArrayList<Integer> list = new ArrayList<Integer>();    
        
        int rIndex = 0;
        int cIndex = 0;
        
        flatten(matrix1, rIndex, cIndex, list); // [1,2,3,4,5,6]
        write(list);
        list.clear();
        flatten(matrix2, rIndex, cIndex, list); // [1,2,3,4,5,6]
        write(list);
        list.clear();
        flatten(matrix3, rIndex, cIndex, list); // [1,2,3]
        write(list);
        list.clear();
        flatten(matrix4, rIndex, cIndex, list); // [1,2,3]
        write(list);
        list.clear();

    } 
    
    public static ArrayList<Integer>  flatten(
        int [][] matrix, int i, int j, ArrayList<Integer> list
    ){
       
        list.add(matrix[i][j]);
        
        if (i != matrix.length-1 || j != matrix[i].length-1) {
            if (j == matrix[i].length-1) {
                j = 0;
                i ++;    
            }else {
                j++;
            }
            flatten(matrix, i, j, list);
        }
        return list;
    }
     
    public static void write(ArrayList<Integer> list){
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println("");
    }
}
