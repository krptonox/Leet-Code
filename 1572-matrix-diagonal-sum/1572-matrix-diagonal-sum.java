class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int row = mat.length;
        int col = mat[0].length;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                 if(i==j){
                    int d1 = mat[i][j];
                    sum+=d1;
                 }
                 if((i+j == row-1) && (i!=j)){
                    int d2 = mat[i][j];
                    sum+=d2;
                 }
            }
        }
        return sum;
    }
}