// package Day9;

class Node {
    int data; 
    Node next; 

    Node(int data){
        this.data = data; 
        this.next = null; 
    }
}


public class ReverseLinkedList {

    public static Node reverseList(Node head){
        Node prev = null; 
        Node curr = head; 

        while(curr != null){
            Node next = curr.next; 
            curr.next = prev; 
            prev = curr; 
            curr = next; 
        }
        return prev; 
    }


    public static Node ArrToLL(int[] arr){
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
        int arr[] = {2, 3, 5, 6, 3, 5}; 

        Node head = ArrToLL(arr); 

        Node reverse = reverseList(head);

        Node temp = reverse; 
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        // System.out.print("null");
        
    }
    
}
