// package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {


    public static List<List<Integer>> generate(int numRows){

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1); 

            for(int j=1; j<i; j++){
                row.add(result.get(i-1).get(j-1) + result.get(i-1).get(j)); 
            }
            
            if(i > 0) row.add(1); 
            result.add(row); 
        }
        return result; 
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int numRows = sc.nextInt(); 

        PascalsTriangle obj = new PascalsTriangle(); 
        List<List<Integer>> triangle = obj.generate(numRows); 


        for(int i=0; i<triangle.size(); i++){
            for(int j=0; j<triangle.get(i).size(); j++){
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }



}
