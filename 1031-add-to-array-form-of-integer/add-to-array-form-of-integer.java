class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> result = new LinkedList<>();

        int i = num.length - 1;
        int carry = 0;
        while( i>=0 || k > 0 || carry > 0){
              int digit = (i>=0)? num[i] : 0;

              int lst_k = (k>0)? k%10 : 0;

              int sum = digit + lst_k + carry;

              carry = sum / 10;

              int digit_to_append = sum % 10;

              result.addFirst(digit_to_append);

              i--;

              k = k / 10; 

            }
          return result;  

    }
}