// package Day5;

import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement1 {


    public static int MajorityElement(int arr[]){

        HashMap<Integer, Integer> mapp = new HashMap<>(); 

        for(int num : arr){
            mapp.put(num, mapp.getOrDefault(num, 0)+1); 
        }

        for(int key : mapp.keySet()){
            if(mapp.get(key) > arr.length/2){
                return key; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 

        int arr[] = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        int element = MajorityElement(arr); 

        System.out.println(element);
    }
}
