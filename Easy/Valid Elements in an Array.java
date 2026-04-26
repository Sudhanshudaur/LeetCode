class Solution {
    private boolean greaterLeft(int idx, int[] nums) {
        int num = nums[idx];
        for (int i = idx - 1; i >= 0; i--) {
            if (nums[idx] <= nums[i])
                return false;
        }
        return true;
    }

    private boolean greaterRight(int idx, int[] nums) {
        int num = nums[idx];
        for (int i = idx + 1; i < nums.length; i++) {
            if (nums[idx] <= nums[i])
                return false;
        }
        return true;
    }

    public List<Integer> findValidElements(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(nums[0]);
        for (int i = 1; i < nums.length - 1; i++) {
            if (greaterLeft(i, nums) || greaterRight(i, nums))
                list.add(nums[i]);
        }
        if (nums.length > 1){
            list.add(nums[nums.length - 1]);
        }
        return list;
    }
}
