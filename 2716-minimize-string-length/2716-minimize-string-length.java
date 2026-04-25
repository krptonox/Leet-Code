class Solution {
    public int minimizedStringLength(String s) {
        StringBuilder sb = new StringBuilder();
        int arr[] = new int[26];
        int count = 0;
        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
            if(arr[ch - 'a'] == 1){
                count++;
            }
        }
        return count;
    }
}