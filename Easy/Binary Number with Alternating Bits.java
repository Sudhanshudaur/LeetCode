class Solution {
    private boolean chk(String s) {
        boolean b = true;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1))
                return false;
        }
        return true;
    }

    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        return chk(binary);
    }
}
