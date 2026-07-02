// package Day32;

import java.util.Scanner;

public class ValidAnagram {
    public boolean isAnagram(String s, String t){
        int count[] = new int[26];

        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++; 
        }

        for(int i=0; i<t.length(); i++){
            count[t.charAt(i)-'a']--; 
        }

        for(int cnt : count){
            if(cnt != 0){
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        String s = sc.next(); 
        String t = sc.next(); 

        ValidAnagram obj = new ValidAnagram(); 
        boolean result = obj.isAnagram(s,t); 

        System.out.println(result);
    }
}
