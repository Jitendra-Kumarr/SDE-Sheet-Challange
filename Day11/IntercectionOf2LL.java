// package Day11;



class Node {
    int data; 
    Node next; 

    Node(int data){
        this.data = data;
        this.next = null; 
    }
}

public class IntercectionOf2LL {


    public Node getIntersectionNode(Node headA, Node headB){
        if(headA == null || headB == null) return null; 

        Node t1 = headA; 
        Node t2 = headB; 

        while (t1 != t2) {
            t1 = t1.next; 
            t2 = t2.next; 

            if(t1 == t2) return t1; 

            if(t1 == null) t1 = headB;
            if(t2 == null) t2 = headA;
        }
        return t1; 
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
        // Create intersection node
        Node intersection = new Node(8);
        intersection.next = new Node(4);
        intersection.next.next = new Node(5);

        // List 1: 4 → 1 → 8 → 4 → 5
        Node head1 = new Node(4);
        head1.next = new Node(1);
        head1.next.next = intersection; // shared node

        // List 2: 5 → 6 → 1 → 8 → 4 → 5
        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(1);
        head2.next.next.next = intersection; // shared node

        IntercectionOf2LL obj = new IntercectionOf2LL();
        Node result = obj.getIntersectionNode(head1, head2);

        if(result != null)
            System.out.println("Intersection at: " + result.data); // 8
        else
            System.out.println("No intersection");
    }
}
