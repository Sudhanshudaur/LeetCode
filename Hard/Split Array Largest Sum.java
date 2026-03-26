class Solution {
    private static boolean isPossible(int[] nums, int k, int mid){
        int sum = 0;
        int cntSubarray = 1;

        for (int x : nums){
            sum += x;
            if (sum > mid){
                cntSubarray++;
                sum = x;
            }
            if (cntSubarray > k){
                return false;
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int s = 0;
        int e = 0;

        for (int x : nums){
            s = Math.max(s, x);
            e += x; 
        }
        int m = 0;
        int res = 0;
        while (s<=e){
           m = s + (e-s)/2;
           if (isPossible(nums, k, m)){
               res = m;
               e = m - 1;
            }
            else{
               s = m + 1;
            }
        }
        return res;
    }
}
