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
        int start = Math.min(n,r);
        int end = Math.max(n,r);
        for(int i=start;i<=end;i++){
            if(i<=1){
                continue;
            }
            boolean isprime = true;
            for(int j=2;j*j<=i;j++){
            if(i%j==0){
                isprime=false;
                break;
            }
            }
           if(isprime){
            sum=sum+i; 
           }
        }
        return sum;
    }
}