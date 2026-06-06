class Solution {
    public boolean consecutiveSetBits(int n) {
        String bin = Integer.toBinaryString(n);
        int cnt = 0;
        for (int i=1; i<bin.length(); i++){
            if (bin.charAt(i-1) == '1' && bin.charAt(i) == '1')
                cnt++;
        }
        if (cnt == 1){
            return true;
        }
        return false;
    }
}
