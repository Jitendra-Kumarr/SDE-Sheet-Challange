
import java.util.ArrayList;
import java.util.Collections;

public class SubSetSum {
    public static void solve(int arr[], int index, int currentSum, ArrayList<Integer> sums){
        if(index == arr.length){
            sums.add(currentSum); 
            return; 
        }

        //pick the element
        solve(arr, index+1, currentSum + arr[index], sums);

        //don't pick the element
        solve(arr, index+1, currentSum, sums);
    }

    public static ArrayList<Integer> subsetSums(int arr[]){
        ArrayList<Integer> sums = new ArrayList<>();
        solve(arr, 0, 0, sums);
        Collections.sort(sums);

        return sums;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3}; 

        ArrayList<Integer> result = subsetSums(arr); 
        System.out.println("Subset Sums (Sorted):" + result);

    }
}
