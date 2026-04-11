class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int res = 0;
        char dig =  Character.forDigit(digit, 10);

        for (int i : nums){
            String s = String.valueOf(i);
            
            for (int j = 0; j < s.length(); j++){
                if(dig == s.charAt(j))
                    res++;
            }
        }
        
        return res;
    }
}
