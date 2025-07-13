/*
 * Date : 12-07-2025
 * Program 4
 * Task : use the labelled for loop
 * Given an array [15,2,4,8,9,5,10,23]
 * Find the numbers and their indexes which sum = 23
 * Example: 2(index=1)+4(index=2)+8(index=3)+9(index=4) = 23
 */

public class program4 {
    public static void main(String[] args) {
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int target = 23;

        A1: // labelled block
        {
            findSums(arr, target, "", "", 0);
        }
    }

    // Recursive method to find combinations
    public static void findSums(int[] arr, int target, String nums, String idx, int start) {
        if (target == 0) {
            // Remove last " + " and print result
            System.out.println(nums.substring(0, nums.length() - 3) + " = 23");
            System.out.println(idx.substring(0, idx.length() - 3));
            System.out.println();
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (arr[i] <= target) {
                findSums(
                        arr,
                        target - arr[i],
                        nums + arr[i] + "(index=" + i + ") + ",
                        idx + i + " + ",
                        i + 1
                );
            }
        }
    }
}
