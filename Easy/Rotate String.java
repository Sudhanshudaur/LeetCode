class Solution {
    public boolean rotateString(String s, String goal) {
        String concatString = s.concat(s);
        if (s.length() == goal.length()) {
            return concatString.contains(goal);
        }
        return false;
    }
}
