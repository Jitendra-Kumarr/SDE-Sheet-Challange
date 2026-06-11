// package Day10;

class Node {
    int data;
    Node next; 

    Node(int data){
        this.data = data; 
        this.next = null; 
    }
}

public class RemoveTheNthNode {

    public Node removeNthFromEnd(Node head, int n){
        Node fast = head; 
        for(int i=0; i<n; i++){
            fast = fast.next;
        }

        if(fast == null) return head.next;

        Node slow = head; 
        while (fast.next != null) {
            fast = fast.next; 
            slow = slow.next; 
        }
        slow.next = slow.next.next; 

        return head; 
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
        int arr[] = {1, 2, 3, 4, 5}; 
        Node head = ArrToLL(arr); 

        RemoveTheNthNode obj = new RemoveTheNthNode();
        Node removed = obj.removeNthFromEnd(head, 2);


        Node temp = removed;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        
    }
}
