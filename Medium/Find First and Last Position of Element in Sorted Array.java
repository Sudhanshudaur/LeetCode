class Solution {
    public int firstIdx(int[] arr, int key) {
        int f = 0;
        int l = arr.length - 1;
        int m = (f + l) / 2;
        int first = -1;

        while (f <= l) {
            if (arr[m] == key) {
                first = m;
                l = m - 1;
            } else if (arr[m] > key) {
                l = m - 1;
            } else {
                f = m + 1;
            }
            m = (f + l) / 2;
        }
        return first;
    }

    public int lastIdx(int[] arr, int key) {
        int f = 0;
        int l = arr.length - 1;
        int m = (f + l) / 2;
        int last = -1;

        while (f <= l) {
            if (arr[m] == key) {
                last = m;
                f = m + 1;
            } else if (arr[m] > key) {
                l = m - 1;
            } else {
                f = m + 1;
            }
            m = (f + l) / 2;
        }
        return last;
    }

    public int[] searchRange(int[] nums, int target) {

        if (nums.length == 0)
            return new int[] { -1, -1 };

        int first = firstIdx(nums, target);
        int last = lastIdx(nums, target);
        int[] ans = new int[] { first, last };
        return ans;
    }
}
