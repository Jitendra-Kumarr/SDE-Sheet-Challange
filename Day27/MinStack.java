// package Day27;

class Stack {
    int arr[]; 
    int size; 
    int top; 

    Stack(int size){
        this.size = size; 
        arr = new int[size]; 
        this.top = -1; 
    }

    void push(int x){
        if(top == size-1){
            return ; 
        }
        top = top+1; 
        arr[top] = x; 
    }

    int pop(){
        if(isEmpty()){
            return -1;
        }
        int value = arr[top]; 
        top = top-1; 
        return value; 
    }

    boolean isEmpty(){
        return top == -1; 
    }

    int peek(){
        return arr[top]; 
    }
}

public class MinStack {
    Stack stack;
    Stack minStack;

    MinStack(int capacity) {          
        stack = new Stack(capacity);
        minStack = new Stack(capacity);
    }

    void push(int x){
        stack.push(x);

        if(minStack.isEmpty() || x <= minStack.peek()){
            minStack.push(x);
        }
    }

    int pop(){
        int poped = stack.pop(); 

        if(poped == minStack.peek()){
            minStack.pop(); 
        }
        return poped; 
    }

    int peek(){
        return stack.peek(); 
    }

    int getMin(){
        return minStack.peek(); 
    }
    public static void main(String[] args) {
        MinStack ms = new MinStack(5);
        ms.push(3);
        ms.push(1);
        ms.push(2);
        ms.push(1);

        System.out.println(ms.getMin()); // 1
        ms.pop();
        System.out.println(ms.getMin()); // 1
        ms.pop();
        System.out.println(ms.getMin()); // 1
        ms.pop();
        System.out.println(ms.getMin()); // 3
    }
}
