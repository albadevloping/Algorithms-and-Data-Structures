/*
 nestedEvenSum

 Write a recursive function called nestedEvenSum.
 Return the sum of all even numbers in a matrix.

 */

package Recursion;


public class nestedEvenSum {
    public static void main(String[] args) {
        int[][] matrix1= { {1,2,3}, 
                           {4,5,6}, // 14
                           {9,5,2}};
        
        int[][] matrix2= { {1,2}, 
                           {3,4}, // 12
                           {5,6} };
        
        int rIndex = 0;
        int cIndex = 0;
        int sum = 0;
        
        sum = nestedEvenSum(matrix1, rIndex, cIndex, sum);
        System.out.println(sum);
        sum = 0;
        sum = nestedEvenSum(matrix2, rIndex, cIndex, sum);
        System.out.println(sum);
    } 
    
    public static int  nestedEvenSum(int[][] matrix, int i, int j, int sum){
        if (i != matrix.length) {
            if (j == matrix[i].length) { 
                j = 0;
                i++;   
            }else{
                if (matrix[i][j] % 2 == 0) {
                    sum += matrix[i][j];
                }
                j++;    
            }
            return nestedEvenSum(matrix, i, j, sum);  
        }else{
            // devolvemos la suma para que cuando se devuelvan las llamadas
            // el contenido se sum se mantenga.
            return sum;
        }
        
    }
}
