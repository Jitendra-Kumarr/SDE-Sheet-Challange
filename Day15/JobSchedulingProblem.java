// package Day15;

import java.util.Arrays;

class Job {
    int id, deadline, profit;
    Job(int id, int deadline, int profit){
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}


public class JobSchedulingProblem {

    public static int[] jobScheduling(Job[] arr, int n){
        Arrays.sort(arr, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0; 
        for(Job Job : arr){
            maxDeadline = Math.max(maxDeadline, Job.deadline);
        }

        int []slots = new int[maxDeadline+1]; 
        Arrays.fill(slots, -1);

        int countJobs = 0, jobProfit = 0;

        for(int i=0; i<n; i++){
            for(int j=arr[i].deadline; j>0; j--){
                if(slots[j] == -1){
                    slots[j] = i; 
                    countJobs++;
                    jobProfit += arr[i].profit;
                    break;
                }
            }
        }
        return new int[]{countJobs, jobProfit};
    }
    public static void main(String[] args) {
        int n = 4;
        Job[] arr = {
            new Job(1, 4, 20),
            new Job(2, 1, 10),
            new Job(3, 2, 40),
            new Job(4, 2, 30)
        };

        int[] ans = JobSchedulingProblem.jobScheduling(arr, n);
        System.out.println("Jobs Done: " + ans[0]);     
        System.out.println("Max Profit: " + ans[1]);
    }
}
