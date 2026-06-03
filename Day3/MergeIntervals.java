// package Day3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class MergeIntervals {


    
    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);

        ArrayList<int[]> result = new ArrayList<>(); 

        int curr[] = intervals[0];
        for(int i=1; i<intervals.length; i++){
            int next[] = intervals[i]; 

            if(curr[1] >= next[0]){
                curr[1] = Math.max(curr[1], next[1]);
            } else {
                result.add(curr); 
                curr = next; 
            }
        }
        result.add(curr); 
        return result.toArray(new int[result.size()][]); 
    }



    public static void printIntervals(int[][] intervals) {
        System.out.print("[");
        for (int i = 0; i < intervals.length; i++) {
            System.out.print("[" + intervals[i][0] + ", " + intervals[i][1] + "]");
            if (i < intervals.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }


    public static void main(String[] args) {
        
        MergeIntervals obj = new MergeIntervals();

        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}}; 
        int[][] result = obj.merge(intervals);

        printIntervals(result);

        System.out.println();

    }
}
