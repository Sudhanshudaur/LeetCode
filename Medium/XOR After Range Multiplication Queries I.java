class Solution {
    private static void operation(int[] nums, int[] query) {
        int mod = 1_000_000_007;
        int idx = query[0];
        while (idx <= query[1]) {
            long n = (long)nums[idx] * query[3];
            nums[idx] = (int) (n % mod); 
            idx += query[2];
        }

    }

    public int xorAfterQueries(int[] nums, int[][] queries) {

        for (int[] query : queries) {
            operation(nums, query);
        }

        int xor = 0;
        for (int i : nums) {
            xor = xor ^ i;
        }

        return xor;
    }
}
