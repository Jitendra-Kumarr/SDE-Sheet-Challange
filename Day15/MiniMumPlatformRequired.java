// package Day15;

import java.util.Arrays;

public class MiniMumPlatformRequired {

    public int countPlatform(int[] arrival, int[] departure){
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int MaxCount = Integer.MIN_VALUE;
        int i=0; 
        int j=0; 

        int count = 0; 
        while (i < arrival.length && j < departure.length) {
            if(arrival[i] <= departure[j]){
                count++; 
                i++; 
            } else {
                count--; 
                j++; 
            }
            MaxCount = Math.max(MaxCount, count);
        }
        return MaxCount; 
    }

    public static void main(String[] args) {
        int[] arrival = {900, 945, 955, 1100, 1500, 1800};
        int[] departure = {920, 1200, 1130, 1150, 1900, 2000};

        MiniMumPlatformRequired obj = new MiniMumPlatformRequired();
        int MiniMumPlatform = obj.countPlatform(arrival, departure); 

        System.out.println(MiniMumPlatform);

    }


}
