import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElement {
    public ArrayList<Integer> nextLargerElement(int[] arr){
        ArrayList<Integer> nge = new ArrayList<>(); 
        Stack<Integer> stack = new Stack<>(); 

        for(int i=arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop(); 
            }

            if(stack.isEmpty()){
                nge.add(-1); 
            } else {
                nge.add(stack.peek()); 
            }
            stack.push(arr[i]); 
        }
        Collections.reverse(nge);
        return nge; 
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4}; 

        NextGreaterElement obj = new NextGreaterElement(); 
        ArrayList<Integer> result = obj.nextLargerElement(arr); 

        System.out.println(result);
    }
}
