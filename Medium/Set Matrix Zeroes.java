class Solution {
    public void setZeroes(int[][] matrix) {

        TreeSet<Integer> row = new TreeSet<>();
        TreeSet<Integer> col = new TreeSet<>();

        int row_no = matrix.length;
        int col_no = matrix[0].length;

        for (int i = 0; i < row_no; i++) {
            for (int j = 0; j < col_no; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for (int r : row) {
            for (int i = 0; i < col_no; i++) {
                matrix[r][i] = 0;
            }
        }

        for (int c : col) {
            for (int i = 0; i < row_no; i++) {
                matrix[i][c] = 0;
            }
        }

    }
}
