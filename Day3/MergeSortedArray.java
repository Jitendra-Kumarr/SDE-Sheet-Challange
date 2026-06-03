// package Day3;

public class MergeSortedArray {


    public void merge(int[] nums1, int m, int[] nums2, int n){
        int i = n-1; 
        int j = m-1; 
        int k = n+m-1; 

        while (i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i]; 
                i--; 
            } else {
                nums1[k] = nums2[j]; 
                j--; 
            }
            k--; 
        }

        while (j >= 0) {
            nums1[k] = nums1[j]; 
            j--; k--; 
        }
    }

    // Helper to print array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }


    public static void main(String[] args) {
        MergeSortedArray obj = new MergeSortedArray();

        // Test Case 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        System.out.print("nums1:  ");  printArray(nums1);
        System.out.print("nums2:  ");  printArray(nums2);
        obj.merge(nums1, m, nums2, n);
        System.out.print("Output: ");  printArray(nums1);
    }
}
