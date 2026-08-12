class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int current = 0;
        int total = 0;
        int diff = 0;
        int pos = -1;
        for(int i=0;i<gas.length;i++){
            diff = gas[i] - cost[i];
            current+=diff;
            total+=diff;
            if(current<0){
               pos = i;
               current = 0;
            }
        }
         if(total >= 0){
                return pos+1;
            }
        return -1;
    }
}