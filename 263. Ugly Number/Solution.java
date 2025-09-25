class Solution {
    public boolean isUgly(int n) {
        int arr[]={2,3,5};
        int count = 0;
        if(n<=0){
            return false;
        }
        for(int factor : arr){
           while(n % factor == 0){
             n = n / factor;
           }
        }
        if(n==1){
            return true;
        }
        else{
            return false;
        }
    }
}