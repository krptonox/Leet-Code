class Solution {
    public int sumOfMultiples(int n) {
        int c = 1;
        int sum = 0;
        while(c<=n){
           if((c%3 == 0) || (c%5 == 0) || (c%7 == 0) ){
            sum = sum + c;
           }
           c++;
        }
        return sum;
    }
}