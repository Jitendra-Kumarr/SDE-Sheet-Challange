// package Day9;

class Node {
    int data; 
    Node next; 

    Node(int data){
        this.data = data;
        this.next = null; 
    }
}

public class MergeTwoSortedList {


    public static Node ArrToLL(int []arr){
        if(arr.length == 0) return null; 

        Node head = new Node(arr[0]); 
        Node curr = head; 

        for(int i=1; i<arr.length; i++){
            curr.next = new Node(arr[i]); 
            curr = curr.next;
        }
        return head; 
    }

    public Node mergeTwoLists(Node list1, Node list2){
        Node dummy = new Node(-1); 
        Node curr = dummy; 

        while (list1 != null && list2 != null) {
            if(list1.data <= list2.data){
                curr.next = list1; 
                list1 = list1.next;
            } else {
                curr.next = list2; 
                list2 = list2.next;
            }
            curr = curr.next; 
        }

        if(list1 != null){
            curr.next = list1;
        } else {
            curr.next = list2; 
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int list1[] = {1, 3, 5, 7, 9};
        int list2[] = {2, 4, 6, 8, 10};

        Node head1 = ArrToLL(list1); 
        Node head2 = ArrToLL(list2); 

        MergeTwoSortedList obj = new MergeTwoSortedList(); 
        Node head = obj.mergeTwoLists(head1, head2); 

        Node temp = head; 
        while (temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next; 
        }
        System.out.print("null");
    }
}
