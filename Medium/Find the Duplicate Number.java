class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int repeated = 0;
        for (int i=0; i<nums.length; i++){
            if (s.contains(nums[i])){
                repeated = nums[i];
                break;
            }
            else{
                s.add(nums[i]);
            }
        }
        return repeated;
    }
}
