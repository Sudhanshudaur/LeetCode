class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        int j = n-1;
        for(int i=0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[j--];
        }
        return ans;
    }
}
