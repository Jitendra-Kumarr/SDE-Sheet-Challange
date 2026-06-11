// package Day9;

class Node {
    int data; 
    Node next; 

    Node(int data){
        this.data = data; 
        this.next = null; 
    }
}

public class MIddleOfLinkedList {

    public static Node MiddleNode(Node head){
        Node slow = head;
        Node fast = head; 

        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
        }
        return slow; 
    }

    public static Node ArrToLL(int arr[]){
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
        int arr[] = {1,2,3,4,5,6,6,4,3,43,3,2,35,34,34,24,34,2,32,32,3}; 

        Node head = ArrToLL(arr); 
        Node middleNode = MiddleNode(head); 
        
        System.out.println(middleNode.data);
    }
}
