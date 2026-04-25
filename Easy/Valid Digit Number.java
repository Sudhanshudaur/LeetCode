class Solution {
    public boolean validDigit(int n, int x) {
        boolean b = false;
        String s = Integer.toString(n);
        char c = (char) ('0' + x);
        if (c == s.charAt(0)){
            return false;
        }
        for (int i=1; i<s.length(); i++){
            if (c == (s.charAt(i))){
                b = true;
                break;
            }
        }

        return b;
    }
}
