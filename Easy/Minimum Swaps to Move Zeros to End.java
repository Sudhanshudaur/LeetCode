class Solution {
    public int minimumSwaps(int[] nums) {
        int l = 0, r = nums.length - 1;
        int cnt = 0;
        while (l < r) {
            if (nums[l] != 0)
                 l++;
            else if (nums[r] == 0)
                 r--;
            else if (nums[l] == 0 && nums[r] != 0){
                cnt++;
                l++;
                r--;
            }
        }
        return cnt;
    }
}
