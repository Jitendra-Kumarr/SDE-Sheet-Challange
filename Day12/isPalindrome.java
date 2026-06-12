// package Day12;

import java.util.Stack;

class Node {
    int data; 
    Node next; 

    Node(int data){
        this.data = data; 
        this.next = null; 
    }
}

public class isPalindrome {


    public boolean IsPalindrome(Node head){
        Stack<Integer> stack = new Stack<>(); 

        Node temp = head; 
        while (temp != null) {
            stack.push(temp.data); 
            temp = temp.next; 
        }

        temp = head; 
        while (temp != null) {
            int top = stack.pop();
            if(top != temp.data) return false; 
            temp = temp.next; 
        }
        return true; 
    }



    public static Node ArrtoLL(int arr[]){
        if(arr.length == 0) return null; 

        Node head = new Node(arr[0]); 
        Node curr = head; 

        for(int i=1; i<arr.length; i++){
            curr.next = new Node(arr[i]); 
            curr = curr.next; 
        }
        return head; 
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1}; 

        Node head = ArrtoLL(arr); 

        isPalindrome obj = new isPalindrome();        
        boolean result = obj.IsPalindrome(head);

        System.out.println(result);

    }
}
