// Solution by me but brute force so TLE

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] out = new long[n];
        for (int i = 0; i < n; i++) {
            int diff = 0;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                if (nums[i] == nums[j])
                    diff += Math.abs(i - j);
            }
            out[i] = diff;
        }
        return out;
    }
}

// Best Approach

import java.util.*;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] res = new long[n];

        HashMap<Integer, ArrayList<Integer>> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        for (ArrayList<Integer> arr : mp.values()) {
            int siz = arr.size();

            long[] pref = new long[siz];
            pref[0] = arr.get(0);

            for (int i = 1; i < siz; i++) {
                pref[i] = pref[i - 1] + arr.get(i);
            }

            for (int i = 0; i < siz; i++) {
                long left = 0, right = 0;

                if (i > 0) {
                    left = (long)i * arr.get(i) - pref[i - 1];
                }
                if (i < siz - 1) {
                    right = (pref[siz - 1] - pref[i]) - (long)(siz - i - 1) * arr.get(i);
                }

                res[arr.get(i)] = left + right;
            }
        }

        return res;
    }
}
