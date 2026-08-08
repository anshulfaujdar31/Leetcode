class Solution {
    public int[] searchRange(int[] nums, int target) {

        int a = 0;
        int b = nums.length - 1;
        int first = -1;

        
        while (a <= b) {
            int mid = (a + b) / 2;

            if (nums[mid] == target) {
                first = mid;
                b = mid - 1;
            }
            else if (nums[mid] > target) {
                b = mid - 1;
            }
            else {
                a = mid + 1;
            }
        }

        int last = -1;
        a = 0;
        b = nums.length - 1;

        
        while (a <= b) {
            int mid = (a + b) / 2;

            if (nums[mid] == target) {
                last = mid;
                a = mid + 1;
            }
            else if (nums[mid] > target) {
                b = mid - 1;
            }
            else {
                a = mid + 1;
            }
        }

        return new int[]{first, last};
    }
}