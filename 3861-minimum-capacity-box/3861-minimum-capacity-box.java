class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int Maxmin = Integer.MAX_VALUE;
        int indx = -1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize && capacity[i]<Maxmin){
                Maxmin = capacity[i];
                indx = i;
            }
        }
        return indx;
    }
}