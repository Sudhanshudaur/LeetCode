//My Approach : Brute Force (Correct) but Time limit exceed

class Solution {
    private int F(int[] nums, int p){
        int n = nums.length;
        int value = 0;
        for (int i=0; i<nums.length; i++){
            value += (i*nums[p]);
            p = (p+1)%n;
        }
        return value;
    }
    public int maxRotateFunction(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i=0; i<n; i++){
            ans = Math.max(ans, F(nums, (n-i)%n));
        }
        return ans;
    }
}

//Best Approach : Dynamic Programming

class Solution {
    public int maxRotateFunction(int[] A) {
        int sum = 0, F = 0;
        int n = A.length;

        for (int i = 0; i < n; i++) {
            sum += A[i];
            F += i * A[i];
        }

        int max = F;

        for (int i = 1; i < n; i++) {
            F += sum - n * A[n - i];
            max = Math.max(max, F);
        }

        return max;
    }
}
