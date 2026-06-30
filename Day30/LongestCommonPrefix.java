// package Day30;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs){
        for(int i=0; i<strs[0].length(); i++){
            char c = strs[0].charAt(i); 

            for(int j=1; j<strs.length; j++){
                if(i == strs[j].length() || c != strs[j].charAt(i)){
                    return strs[0].substring(0,i); 
                }
            }
        }
        return strs[0]; 
    }
    public static void main(String[] args) {
        String[] strs = {"Flower", "Flow", "Flight"}; 
        LongestCommonPrefix obj = new LongestCommonPrefix(); 

        String result = obj.longestCommonPrefix(strs); 

        System.out.println(result);
    }
}
