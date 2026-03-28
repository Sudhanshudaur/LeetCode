class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int mindiff = Integer.MAX_VALUE;
        boolean loopRun = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] == 1) && (nums[j] == 2) || (nums[i] == 2) && (nums[j] == 1)) {
                    mindiff = Math.min(mindiff, Math.abs(i - j));
                    loopRun = true;
                }
            }
        }
        if (!loopRun) {
            mindiff = -1;
        }
        return mindiff;
    }
}
