class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] arr = s.toCharArray();
        int i=0, j=arr.length - 1;
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        String str = String.valueOf(arr);
        if(str.equals(s)) return true;
        return false;
    }
}