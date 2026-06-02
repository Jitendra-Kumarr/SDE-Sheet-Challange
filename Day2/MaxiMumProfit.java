// package Day2;

import java.util.Scanner;

public class MaxiMumProfit {

    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE; 
        int maxProfit = 0; 

        for(int i=0; i<prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i]; 
            }

            int profit = prices[i] - minPrice; 
            maxProfit = Math.max(maxProfit, profit); 
        }
        return maxProfit; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int n = sc.nextInt(); 
        int arr[] = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); 
        }

        System.out.println(maxProfit(arr));

    }
    
}