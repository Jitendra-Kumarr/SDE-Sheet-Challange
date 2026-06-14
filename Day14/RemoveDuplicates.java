// package Day14;

import java.util.Scanner;

public class RemoveDuplicates {

    public int removeDuplicates(int arr[]){
        int k=1; 
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] != arr[i]){
                arr[k] = arr[i]; 
                k++; 
            }
        }
        return k;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n = sc.nextInt(); 
        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt(); 
        }

        RemoveDuplicates obj = new RemoveDuplicates(); 
        
        int result = obj.removeDuplicates(arr); 

        System.out.println(result);

    }
}
