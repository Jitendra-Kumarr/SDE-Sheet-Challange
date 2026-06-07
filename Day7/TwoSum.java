// package Day7;

import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int []arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    return new int[]{i,j}; 
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        int arr[] = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt(); 

        int result[] = twoSum(arr, target); 

        System.out.println("["+ result[0] + "," + result[1]+"]");
    }
}
