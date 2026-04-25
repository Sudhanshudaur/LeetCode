// My Solution not passing all test cases

class Solution {
    public int compareBitonicSums(int[] nums) {
        boolean b = true;
        long aSum = nums[0];
        long dSum = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                b = false;
                dSum += nums[i-1];
            }
            if (b){
                aSum += nums[i];
            }
            if (!b){
                dSum += nums[i];
            }
        }
        int ans = 0;
        if (aSum > dSum){
            ans = 0;
        }
        else if (dSum > aSum){
            ans = 1;
        }
        else{
            ans = -1;
        }
        return ans;
    }
}

// Correct Solution

class Solution {
    public int compareBitonicSums(int[] nums) {
        int n = nums.length

        int peak = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[peak]) {
                peak = i;
            }
        }

        long aSum = 0;
        long dSum = 0;

        for (int i = 0; i <= peak; i++) {
            aSum += nums[i];
        }

        for (int i = peak; i < n; i++) {
            dSum += nums[i];
        }

        if (aSum > dSum) return 0;
        if (dSum > aSum) return 1;
        return -1;
    }
}
