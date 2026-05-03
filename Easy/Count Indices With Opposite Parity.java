class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i=0; i<n-1; i++){
            int cnt = 0;
            for (int j=i+1; j<n; j++){
                if (nums[i]%2==0 && nums[j]%2==1)
                    cnt++;
                if (nums[i]%2==1 && nums[j]%2==0)
                    cnt++;
            }
            res[i] = cnt;
        }
        return res;
    }
}
