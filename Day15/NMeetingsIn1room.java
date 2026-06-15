// package Day15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NMeetingsIn1room {
    public List<Integer> MaxMeeting(int []start, int []end){
        List<int[]> meetings = new ArrayList<>();
        
        for(int i=0; i<start.length; i++){
            meetings.add(new int[]{end[i], start[i], i+1});
        }

        meetings.sort(Comparator.comparingInt(a->a[0]));

        ArrayList<Integer> result = new ArrayList<>();
        int lastEnd = -1; 

        for(int m[] : meetings){
            if(m[1] >= lastEnd){
                result.add(m[2]);
                lastEnd = m[0]; 
            }
        }
        return result; 
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end   = {2, 4, 6, 7, 9, 9};

        NMeetingsIn1room obj = new NMeetingsIn1room();
        List<Integer> result = obj.MaxMeeting(start, end);

        System.out.println("Count : " + result.size());
        System.out.print("Order : ");
        for (int i : result) System.out.print(i + " ");

    }

}
