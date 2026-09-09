class Solution {
    public int uniquePathsWithObstacles(int[][] obs) {
        if(obs[0][0]==1) return 0;
        obs[0][0] = 1;
        int m = obs.length;
        int n = obs[0].length;
        for(int i=1;i<m;i++){
            if(obs[i][0]==1){
                obs[i][0] = 0;
            }
            else{
                obs[i][0] = obs[i-1][0];
            }
        }
         
        for(int j=1;j<n;j++){
            if(obs[0][j]==1){
                obs[0][j] = 0;
            }
            else{
                obs[0][j] = obs[0][j-1];
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obs[i][j]==1){
                    obs[i][j] = 0;
                }
                else{
                    obs[i][j] = obs[i][j-1]+obs[i-1][j];
                }
            }
        }
        return obs[m-1][n-1];
    }
}