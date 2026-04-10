class Solution {
    public int minimumDistance(int[] nums) {
        int len = nums.length;

        int min = 1000;
        boolean updateMin = false;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] != nums[j]) continue;
                for (int k = j + 1; k < len; k++) {
                    if (nums[i] == nums[j] && nums[i] == nums[k]) {
                        min = Math.min(min, Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i));
                        updateMin = true;
                        break;
                    }
                }
            }
        }
        if (updateMin) {
            return min;
        }
        return -1;

    }
}
