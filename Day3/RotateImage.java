// package Day3;

public class RotateImage {

    public static void rotateImage(int matrix[][]){
        int n = matrix.length; 
        int m = matrix[0].length; 

        for(int i=0; i<n; i++){
            for(int j=i+1; j<m; j++){
                int temp = matrix[i][j]; 
                matrix[i][j] = matrix[j][i]; 
                matrix[j][i] = temp; 
            }
        }


        for(int i=0; i<n; i++){
            int start = 0; 
            int end = n-1; 
            while (start < end) {
                int temp = matrix[i][start]; 
                matrix[i][start] = matrix[i][end]; 
                matrix[i][end] = temp; 
                start++; end--; 
            }
        }
    }


    public static void printMatrix(int matrix[][]){
        int n = matrix.length; 
        int m = matrix[0].length; 

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        RotateImage obj = new RotateImage(); 

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Before Roatation : ");
        printMatrix(matrix); 

        obj.rotateImage(matrix); 

        System.out.println("After Roatation : ");
        printMatrix(matrix);



    }
}