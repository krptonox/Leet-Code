class Solution {

    public int calcSquare(int num)
    {
        int sq=0; int rem;
        while(num!=0)
        {
            rem = num%10;
            sq =sq+ (rem*rem);
            num=num/10;
        }
        return sq;
    }

    public boolean isHappy(int n) 
    {
        int slow = n;
        int fast = n;
        do
        {
           slow = calcSquare(slow);
           fast = calcSquare(calcSquare(fast));
        }while(slow!=fast);

        if(slow==1)
        {
            return true;
        }
        return false;
    }
}