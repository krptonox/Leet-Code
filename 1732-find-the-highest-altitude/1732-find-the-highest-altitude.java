class Solution {
    public int largestAltitude(int[] gain) {
        int Gain = 0;
        int maxgain = 0;
        for(int i=0;i<gain.length;i++){
            Gain = Gain + gain[i];
            if(maxgain < Gain){
                maxgain = Gain;
            }
        }
        return maxgain;
    }
}