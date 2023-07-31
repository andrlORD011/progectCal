package Algorithms;

public class Binary {
    public static int search(int[] nums, int target) {
        int left = 0;
        int reight = nums.length - 1;
        return rec(nums, target, left, reight);
    }

    private static int rec(int[] nums, int target, int left, int right) {
        int mid = (left + right) / 2;
        if (left > right) {
            return -1;
        } else if (target == nums[mid]) {
            return mid;
        } else if (target > nums[mid]) {
            return rec(nums, target, mid + 1, right);
        } else {
            return rec(nums, target, left, right - 1);
        }

    }

    public static void main(String[] args) {
        int []a = {1,2,3,4,6,7,12,13,14,16,11};
        System.out.println( Binary.search(a,4));
    }
}

