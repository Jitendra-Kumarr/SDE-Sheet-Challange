// package Day16;

import java.util.Arrays;

public class AssignCookies {

    public int findContentChildren(int g[], int s[]){
        int n = g.length; 
        int m = s.length; 

        int i=0; 
        int j=0; 
        Arrays.sort(g);
        Arrays.sort(s);

        while (i < n && j < m) {
            if(g[i] <= s[j]){
                i++;
            }
            j++;
        }
        return i; 
    }
    
    public static void main(String[] args) {

        int g[] = {1, 5, 3, 3, 4};
        int s[] = {4, 2, 1, 2, 1, 3};

        AssignCookies obj = new AssignCookies();
        int MaxiMumCookiesDistrubuted = obj.findContentChildren(g,s); 

        System.out.println(MaxiMumCookiesDistrubuted);

    }
}
