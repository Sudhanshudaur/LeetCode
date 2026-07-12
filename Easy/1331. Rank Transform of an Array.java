class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return new int[] {};
        }

        int[] temp = arr.clone();
        Arrays.sort(temp);

        int tout[] = new int[n];
        int out[] = new int[n];

        int rank = 1;
        tout[0] = 1;

        for (int i = 1; i < n; i++) {
            if (temp[i - 1] != temp[i]) {
                tout[i] = ++rank;
            } else {
                tout[i] = rank;
            }
        }

        int k = 0;
        for (int i = 0; i < n; i++) {
            out[i] = tout[Arrays.binarySearch(temp, arr[k++])];
        }

        return out;
    }
}
