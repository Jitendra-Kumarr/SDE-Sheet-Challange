// package Day5;

import java.util.Scanner;

public class PowXpowerN {

    public static double myPow(double x, int n){

        double ans = 1.0; 
        double nn = n; 
        if(nn < 0) nn = -1*nn; 

        while (nn > 0) {
            if(nn%2 == 1){
                ans = ans * x; 
                nn = nn - 1; 
            } else {
                x = x*x; 
                nn = nn/2; 
            }
        }
        if(n < 0) ans = 1.0/ans; 
        return ans; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        double x = sc.nextInt(); 
        int n = sc.nextInt(); 

        double result = myPow(x, n); 
        System.out.println(result);
    }
}
