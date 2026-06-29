// package Day29;

import java.util.Scanner;

public class WordReverse {
    public String reverseWords(String s){
        s = s.trim(); 
        String Words[] = s.split("\\s+"); 

        StringBuilder result = new StringBuilder(); 

        for(int i=Words.length-1; i>=0; i--){
            result.append(Words[i]); 

            if(i != 0){
                result.append(" "); 
            }
        }
        return result.toString(); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        WordReverse obj = new WordReverse(); 

        String str = sc.nextLine(); 

        String result = obj.reverseWords(str); 
        System.out.println(result);
    }
}
