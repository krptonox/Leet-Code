class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int max = piles[0];
        for(int i=1;i<piles.length;i++){
             max = Math.max(max,piles[i]);
        }
        while(low<max){
            int mid = (low + max) / 2;
            int k1 = hour(mid, piles);
            if(k1<=h) max = mid;
            else low = mid + 1;
        }
        return low;
    }

    public int hour(int mid, int[] piles){
        int hr = 0;
        for(int i=0;i<piles.length;i++){
            hr = hr + (piles[i]+mid-1)/mid;
        }
        return hr;
    }
}