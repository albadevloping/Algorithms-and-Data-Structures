/*
 stringifyNumbers

 Write a function called stringifyNumbers which takes in a 
 matrix of numbers and converts them to strings.
 Recursion would be a great way to solve this!

 */

package Recursion;


public class stringifyNumbers {
    public static void main(String[] args) {
        int[][] matrix1= { {1,2,3}, 
                           {4,5,6} };
        
        int[][] matrix2= { {1,2}, 
                           {3,4},
                           {5,6} };

        int rIndex = 0;
        int cIndex = 0;
        
        String[][] m1 = new String[matrix1.length][matrix1[0].length];
        String[][] m2 = new String[matrix2.length][matrix2[0].length];
        
        nestedEvenSum(matrix1, rIndex, cIndex, m1);
        write(m1);
        
        nestedEvenSum(matrix2, rIndex, cIndex, m2);
        write(m2);
    } 
    
    public static void  nestedEvenSum(int[][] matrix, int i, int j, String[][] m2){
        
        if (i != matrix.length) {
            if (j == matrix[i].length) { 
                j = 0;
                i++;    
            }else{
                m2[i][j] = Integer.toString(matrix[i][j]);
                j++;
            }
            nestedEvenSum(matrix, i, j, m2);    
        }    
    }
    
    public static void write(String[][] m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
