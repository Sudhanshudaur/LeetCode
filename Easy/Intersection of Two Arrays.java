class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            s.add(nums1[i]);
        }
        Set<Integer> r = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (s.contains(nums2[i])) {
                r.add(nums2[i]);
            }
        }
        int[] res = new int[r.size()];
        int i = 0;
        for (int n : r) {
            res[i++] = n;
        }
        return res;
    }
}
