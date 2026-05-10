class Solution {
    public long minArraySum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int a : nums)
            
        for (int i=n-1; i>=1; i--){
            for (int j=0; j<i ; j++){
                if (nums[j] != 0 && nums[i]%nums[j] == 0){
                    nums[i] = nums[j];
                    break;
                }
            }
        }

        int sum = 0;
        for (int a : nums){
            sum += a;
        }

        return sum;
    }
}
