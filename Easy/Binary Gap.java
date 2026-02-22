class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int i = 0, j = 0;
        int ans = 0;
        while (j < s.length()-1) {
            if (s.charAt(i) == '0')
                i++;
            if (s.charAt(j) == '0')
                j++;
            if (i == j)
                j++;
            if (s.charAt(i) == '1' && s.charAt(j) == '1') {
                ans = Math.max(ans, j - i);
                i++;
                j++;
            }
        }
        return ans;
    }
}
