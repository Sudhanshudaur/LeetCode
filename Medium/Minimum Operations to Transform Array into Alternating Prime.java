class Solution {
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public int minOperations(int[] nums) {
       int minOpr = 0;

        for (int i=0 ; i<nums.length; i++){
            if (i%2==0 && !isPrime(nums[i])){
                while (!isPrime(nums[i])){
                       nums[i]++;
                    minOpr++;
                }
            }
            else if (i%2==1 && isPrime(nums[i])){
                while (isPrime(nums[i])){
                    nums[i]++;
                    minOpr++;
                }
            }
        }
        return minOpr;
    }
}
