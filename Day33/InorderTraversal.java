// package Day33;

class Node {
    int data; 
    Node left; 
    Node right; 

    Node(int data){
        this.data = data; 
    }
}

public class InorderTraversal {

    public void inorderTraversal(Node root){
        if(root == null){ return ; }

        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        root.right.left = new Node(12);
        root.right.right = new Node(20);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.left.right.right = new Node(8);
        root.right.left.left = new Node(11);
        root.right.right.right = new Node(25);
        root.right.right.right.left = new Node(22);

        InorderTraversal obj = new InorderTraversal(); 
        obj.inorderTraversal(root); 
    }
}
