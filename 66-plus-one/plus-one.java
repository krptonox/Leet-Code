class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        if (digits.length == 1 && digits[0] == 0) {
            digits[0] = 1;
            return digits;
        } 
        else{
        for(int i=1;i<=digits.length;i++){
            int idx = digits.length - i;
            int sum = digits[idx] + carry;
            digits[idx] = sum % 10;
            carry = sum / 10;

            if (carry == 0) break;
        }

        if(carry == 1){
            int result[] = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        return digits;
        }
    }
}