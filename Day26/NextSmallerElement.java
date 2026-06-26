// package Day26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NextSmallerElement {
    public List<Integer> nextSmallerElement(int arr[]){
        ArrayList<Integer> nse = new ArrayList<>(); 
        Stack<Integer> stack = new Stack<>(); 

        for(int i=arr.length-1; i>=0; i--){
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                nse.add(-1); 
            } else {
                nse.add(stack.peek()); 
            }

            stack.add(arr[i]); 
        }
        Collections.reverse(nse);
        return nse; 
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 5, 3, 2, 5, 1, 5}; 

        NextSmallerElement obj = new NextSmallerElement(); 
        List<Integer> result = obj.nextSmallerElement(arr);
        System.out.print(result); 
    }
}
