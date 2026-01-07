class Solution {
    public int findClosest(int x, int y, int z) {
      int dx = Math.abs(x - z);
      int dy = Math.abs(y - z);

      if(dx>dy){
        return 2;
      }
      else if(dx==dy){
      return 0;
      }

      return 1;

    }
}