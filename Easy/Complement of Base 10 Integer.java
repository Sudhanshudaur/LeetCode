class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        String comp =  "";
        while (n>0) {
            char c;
            if ((n & 1) == 1)
               c = '0';
            else 
               c = '1';
            comp = c + comp;
            n = n >> 1;
        }
        int ans = Integer.parseInt(comp, 2);
        return ans;
    }
}
