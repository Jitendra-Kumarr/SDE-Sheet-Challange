// package Day1;

import java.util.Scanner;

public class NextPermutation {

    public void reverse(int arr[], int i, int j){
        while(i < j){
            int temp = arr[i]; 
            arr[i] = arr[j]; 
            arr[j] = temp; 
            i++; j--;
        }
    }

    public void swap(int arr[], int i, int j){
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    }

    public void nextPermutation(int arr[]){

        int dip = -1; 
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] < arr[i+1]){
                dip = i; 
                break; 
            }
        }

        if(dip == -1){
            reverse(arr, 0, arr.length-1); 
            return; 
        }

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] > arr[dip]){
                swap(arr, dip, i);
                break; 
            }
        }

        reverse(arr, dip+1, arr.length-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 

        int arr[] = new int[n]; 
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        NextPermutation obj = new NextPermutation();
        obj.nextPermutation(arr);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
