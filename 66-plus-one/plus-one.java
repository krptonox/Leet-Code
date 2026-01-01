class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int sum = 0;
        int l = digits.length;
        int idx = 0;
        int ix = 1;
        if(digits.length == 1 && digits[0] == 0){
            digits[0] = 1;
            return digits;
        }
        else{
            for(int i=digits.length - 1;i>=0;i--){
               sum = digits[i] + carry;
               idx = sum % 10 ;
               digits[digits.length - ix] = idx;
               carry = sum/10;
               ix++;
    
               if(carry == 0){
                break;
               }
            }
            if(carry == 1){
                int result[] = new int[digits.length + 1];
                result[0] =  1;
                return result;
            }
           
        }
        return digits;
    }
}