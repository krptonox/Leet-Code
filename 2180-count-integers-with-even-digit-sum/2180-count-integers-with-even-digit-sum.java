class Solution {
    public int countEven(int num) {
        int count = 0;
        for(int i=1;i<=num;i++){
            int temp = i;
            int sum = 0;
           while(sum<=num){
              int rem = temp%10;
              sum+=rem;
              temp=temp/10;
              if(temp==0) break;
           }
           if(sum%2==0){
            count++;
           }
        }
        return count;
    }
}