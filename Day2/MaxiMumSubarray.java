// package Day2;

import java.util.Scanner;

public class MaxiMumSubarray {

    public static int maxSubArray(int[] arr){
        int MixiMum = Integer.MIN_VALUE; 
        int sum = 0; 

        for(int i=0; i<arr.length; i++){
            sum += arr[i]; 

            if(sum > MixiMum){
                MixiMum = sum;
            }

            if(sum < 0){
                sum = 0; 
            }
        }
        return MixiMum; 
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in); 

        int n = sc.nextInt();
        int arr[] = new int[n]; 

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        int result = maxSubArray(arr); 

        System.out.println(result);

    }
}
