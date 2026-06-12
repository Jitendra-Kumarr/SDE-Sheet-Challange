// package Day12;

class Node {
    int data; 
    Node next; 

    Node(int data){
        this.data = data; 
        this.next = null; 
    }
}

public class LinkedLIstCycle2 {

    public Node detectCycle(Node head){
        Node slow = head; 
        Node fast = head; 

        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 

            if(slow == fast){
                slow = head; 

                while(slow != fast){
                    slow = slow.next; 
                    fast = fast.next; 
                }
                return slow;
            }
        }
        return null;
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
        int arr[] = { 1, 3, 4, 5, 3, 2, 3, 5}; 
        Node head = ArrtoLL(arr);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Create cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        LinkedLIstCycle2 obj = new LinkedLIstCycle2();
        Node result = obj.detectCycle(head);

        if (result != null)
            System.out.println("Cycle starts at: " + result.data);
        else
            System.out.println("No cycle found.");
    }
}
