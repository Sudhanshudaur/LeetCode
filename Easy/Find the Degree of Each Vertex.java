class Solution {
    public int[] findDegrees(int[][] matrix) {
        int arr[] = new int[matrix.length];
        int cnt = 0;

        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (matrix[i][j] == 1){
                    cnt++;
                }
            }
            arr[i] = cnt;
            cnt = 0;
        }

        return arr;
    }
}
