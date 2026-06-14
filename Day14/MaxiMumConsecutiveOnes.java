// package Day14;

import java.util.Scanner;

public class MaxiMumConsecutiveOnes {

    public int findMaxConsecutiveOnes(int arr[]){
        int MaxiMumOnes = 0; 

        int count = 0; 
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++; 
                MaxiMumOnes = Math.max(MaxiMumOnes, count); 
            } else {
                count = 0; 
            }
        }
        return MaxiMumOnes; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt(); 
        }

        MaxiMumConsecutiveOnes obj = new MaxiMumConsecutiveOnes(); 

        int result = obj.findMaxConsecutiveOnes(arr); 

        System.out.println(result);

    }
}
