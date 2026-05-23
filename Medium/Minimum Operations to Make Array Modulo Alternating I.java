class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length;
        int res = Integer.MAX_VALUE;

        for (int x = 0; x < k; x++) {
            for (int y = 0; y < k; y++) {
                if (x == y)
                    continue;
                int op = 0;
                for (int i = 0; i < n; i++) {
                    int trem = (i % 2 == 0) ? x : y;
                    int crem = nums[i] % k;
                    int d = Math.abs(trem - crem);
                    op += Math.min(d, k - d);
                }
                res = Math.min(op, res);
            }
        }
        return res;
    }
}
