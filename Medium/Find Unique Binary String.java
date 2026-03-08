class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        Set s = new HashSet<>();
        
        for(String str : nums) {
            s.add(Integer.parseInt(str, 2));
        }
        
        for(int i = 0; i < (1 << n); i++) {
            if(!st.contains(i)) {
                String binary = Integer.toBinaryString(i);
                while(binary.length() < n) {
                    binary = "0" + binary;
                }
                return binary;
            }
        }
        
        return "";
    }
}
