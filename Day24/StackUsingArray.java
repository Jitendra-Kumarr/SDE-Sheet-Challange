// package Day24;

class Stack { 
    int arr[];
    int size; 
    int top; 

    Stack(int size){
        this.size = size; 
        arr = new int[size]; 
        top = -1; 
    } 

    void push(int x){
        if(top == size-1){
            return ;
        }
        top = top+1; 
        arr[top] = x; 
    }

    int pop(){
        if(top == -1){
            return -1;
        }
        int val = arr[top]; 
        top = top-1; 
        return val; 
    }

    int peek(){
        if(isEmpty()){
            return -1; 
        }
        return arr[top]; 
    }

    boolean isEmpty(){
        return top == -1; 
    }
}

public class StackUsingArray {
    

    public static void main(String[] args) {
        Stack stack = new Stack(5); 

        stack.push(3); 
        stack.push(4); 
        stack.push(2); 
        stack.pop();

        System.out.println(stack.peek());
    }
}
