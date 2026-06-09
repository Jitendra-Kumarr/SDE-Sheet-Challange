// package Day8;

import java.util.Scanner;

public class LargestSubarrayWithSumEqtok {

    public static int longestSubarray(int[] arr, int k){
        int MaxLength = 0; 

        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j]; 

                if(sum == k){
                    MaxLength = Math.max(MaxLength, j-i+1); 
                }
            }
        }
        return MaxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n]; 
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int result = longestSubarray(arr, k);
        System.out.println(result);
    }

}
