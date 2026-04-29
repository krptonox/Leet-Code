class Solution {
    public int countEven(int num) {
        int sum = digitSum(num);
        if(sum%2==0){
            return num/2;
        }
        return (num-1)/2;
    }
    public static int digitSum(int num){
        int sum = 0;
        while(num>0){
            int dig = num%10;
            sum+=dig;
            num=num/10;
        }
        return sum;
    }
}