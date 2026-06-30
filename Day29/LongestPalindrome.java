import java.util.Scanner;

public class LongestPalindrome {

    public static boolean isPalindrome(String s, int i, int j){
        int start = i; 
        int end = j; 
        
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false; 
            }
            start++; end--; 
        }
        return true; 
    }

    public static String longestPalindrome(String s){
        int maxLength = 0; 
        int start = 0, end = 0; 

        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(isPalindrome(s, i, j)){
                    if(j-i+1 > maxLength){
                        maxLength = j-i+1; 
                        start = i; 
                        end = j; 
                    }
                }
            }
        }
        return s.substring(start, end+1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String s = sc.nextLine();

        String result = longestPalindrome(s); 

        System.out.println(result);
        
    }
}
