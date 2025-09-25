class Solution {
    public boolean isHappy(int n) {
        int i = 0; 
        
        while (i < 1000) { 
            int sum = 0;
            int temp = n;
            
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem * rem;
                temp /= 10;
            }
            
            if (sum == 1) {
                return true; 
            }
            
            n = sum;
            i++;
        }
        
        return false; 
    }
}