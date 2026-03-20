class Solution {
    public int findMin(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int minElement = nums[0];
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[s] <= nums[m]) {
                minElement = Math.min(nums[s], minElement);
                s = m + 1;
            } else {
                minElement = Math.min(nums[m], minElement);
                e = m - 1;
            }
        }
        return minElement;
    }
}
