class Solution {
    public int sumOfPrimesInRange(int n) {
        int r=0;
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            r=(r*10)+digit;
            temp=temp/10;
        }
        int sum = 0;
        if(n>r){
            for(int i=r;i<=n;i++){
                if(isPrime(i)){
                    sum+=i;
                }
            }
        }
        else{
            for(int i=n;i<=r;i++){
                if(isPrime(i)){
                    sum+=i;
                }
            }
        }
        return sum;
    }
    public boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;

        }
        return true;
    }
}