class Solution {
    public long sumAndMultiply(int n) {
        if (n == 0) {
            return 0;
        }
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        int multiple = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                sb.append(s.charAt(i));
                multiple += s.charAt(i) - '0';
            }
        }
        return Long.parseLong(sb.toString()) * multiple;
    }
}
