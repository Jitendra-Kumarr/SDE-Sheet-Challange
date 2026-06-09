// package Day8;

import java.util.Scanner;

public class CountTheNoOfSubarrayWithGivenXOReqToK {

    public static long subarrayXor(int arr[], int k) {
        
        int count = 0; 
        for(int i=0; i<arr.length; i++){
            int xorVal = 0; 
            for(int j=i; j<arr.length; j++){
                xorVal ^= arr[j]; 
                
                if(xorVal == k){
                    count++; 
                }
            }
        }
        return count; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n]; 
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        long result = subarrayXor(arr, k);
        System.out.println(result);

        sc.close();
    }
}
