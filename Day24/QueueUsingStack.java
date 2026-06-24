// package Day24;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack1 = new Stack<>(); 
    Stack<Integer> stack2 = new Stack<>(); 

    void enqueue(int x){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop()); 
        }
        stack1.push(x); 

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop()); 
        }
    }

    int dequeue(){
        if(stack1.isEmpty()){
            return -1; 
        }
        return stack1.pop(); 
    }

    int peek(){
        if(stack1.isEmpty()){
            return -1; 
        }

        return stack1.peek(); 
    }

    boolean isEmpty(){
        return stack1.isEmpty(); 
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack(); 

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());  // 1
        System.out.println(queue.dequeue());  // 2
        System.out.println(queue.peek());     // 3
    }

}
