class Solution {
    private static int ascii(String s){
        int asc = 0;
        for (int i=0; i<s.length(); i++){
            asc += s.charAt(i);
        }
        return asc;
    }
    public char findTheDifference(String s, String t) {
        char extraChar = (char) Math.abs(ascii(s)-ascii(t));
        return extraChar;
    }
}
