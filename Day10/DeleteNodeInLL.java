// package Day10;

class Node {
    int data;
    Node next; 

    Node(int data){
        this.data = data; 
        this.next = null; 
    }
}

public class DeleteNodeInLL {

    public void deleteNode(Node node) {
        node.data = node.next.data; 
        node.next = node.next.next;
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

    public static Node getNode(Node head, int val){
        Node temp = head;
        while(temp != null){
            if(temp.data == val) return temp;  // found it!
            temp = temp.next;
        }
        return null;  // not found
    }
    

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5}; 
        Node head = ArrToLL(arr); 

        DeleteNodeInLL obj = new DeleteNodeInLL();

        Node delete = getNode(head, 3); 
        obj.deleteNode(delete); 


        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

}
