package Lesson17;

public class TesrBinary {
    public static int search(int[] nums, int target) {
        int leaft = 0;
        int right = nums.length - 1;
        return rec(nums, target, leaft, right);
    }

    private static int rec(int[] nums, int target, int left, int right) {
        int mid = (left + right) / 2;
        if (left > right) {
            return -1;
        } else if (target == nums[mid]) {
            return target;
        } else if (target > nums[mid]) {
            return rec(nums, target, mid + 1, right);
        } else {
            return rec(nums, target, left, mid - 1);
        }
    }
}
