class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = 10000;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                int k = Math.abs(i - start);
                if (min > k)
                    min = k;
            }
        }
        return min;
    }
}
