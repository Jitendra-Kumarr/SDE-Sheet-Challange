// package Day25;

import java.util.Stack;

public class BalancedParanthesis {
    
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>(); 

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch); 
            } else {
                if(stack.isEmpty()) return false; 

                char top = stack.pop(); 
                if(ch == ')' && top != '(' ||
                   ch == '}' && top != '{' ||
                   ch == ']' && top != '[' ) {return false;}
            }
        }
        return stack.isEmpty(); 
    }
    public static void main(String[] args) {
        BalancedParanthesis bp = new BalancedParanthesis();

        System.out.println(bp.isValid("(){}[]"));   // true
        System.out.println(bp.isValid("({[]})"));   // true
        System.out.println(bp.isValid("({[})"));    // false
        System.out.println(bp.isValid("((("));      // false
    }
}
