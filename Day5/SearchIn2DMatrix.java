// package Day5;

import java.util.Scanner;

public class SearchIn2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target){
        int n = matrix.length; 
        int m = matrix[0].length; 

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false; 
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int target = sc.nextInt();

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        boolean result = searchMatrix(matrix, target); 

        System.out.println(result);
    }

}
