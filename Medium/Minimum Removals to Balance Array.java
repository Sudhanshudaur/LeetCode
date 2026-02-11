class Solution {
    public int minRemoval(int[] nums, int k) {
        if(nums.length==1)  return 0;

        int max=Integer.MIN_VALUE;
        int l=0;
        Arrays.sort(nums);
        int r=0;
        while(r<nums.length){
             if(nums[r]>(1L*k*nums[l])){
                  ++l;
             }
             max=Math.max(max,r-l+1);
             ++r;
        }
        return (nums.length-max);
    }
}
