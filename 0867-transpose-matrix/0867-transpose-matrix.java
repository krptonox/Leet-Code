class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix[0].length;
        int col = matrix.length;
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
    }
}