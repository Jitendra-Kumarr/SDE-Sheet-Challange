// package Day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MajorityElement2 {
    static List<Integer> majorityElement2(int arr[]){
        int n = arr.length; 

        HashMap<Integer, Integer> mapp = new HashMap<>(); 
        ArrayList<Integer> result = new ArrayList<>(); 

        int mini = n/3+1; 

        for(int i=0; i<n; i++){

            mapp.put(arr[i], mapp.getOrDefault(arr[i], 0)+1); 

            if(mapp.get(arr[i]) == mini){
                result.add(arr[i]); 
            }

            if(result.size() == 2){
                break; 
            }
        }
        return result; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 

        int arr[] = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        List<Integer> element = majorityElement2(arr); 

        System.out.println(element);

        sc.close();
    }
}