// package Day4;

public class repeatingNmissing {

    public int[] repeatingandmissing(int arr[]){
        int n = arr.length; 

        int hash[] = new int[n+1]; 
        for(int i=0; i<arr.length; i++){
            hash[arr[i]]++; 
        }

        int repeating = -1, missing = -1;

        for(int i=1; i<hash.length; i++){
            if(hash[i] == 2){
                repeating = i;
            } else if (hash[i] == 0){
                missing = i; 
            }

            if(repeating != -1 && missing != -1){
                break; 
            }
        }
        return new int[]{repeating, missing}; 
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};

        repeatingNmissing obj = new repeatingNmissing(); 

        int result[] = obj.repeatingandmissing(nums); 

        System.out.println("The Repeating & Missing are : {" + result[0] + "," + result[1] + "}");

    }
}
