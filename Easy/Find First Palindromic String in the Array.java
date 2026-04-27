class Solution {
    private boolean chkPalindrome(String str) {
        int s = 0;
        int e = str.length() - 1;
        while (s < e) {
            if (str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public String firstPalindrome(String[] words) {

        String ans = "";
        for (int i = 0; i < words.length; i++) {
            if (chkPalindrome(words[i])) {
                ans = words[i];
                break;
            }
        }
        return ans;
    }
}
