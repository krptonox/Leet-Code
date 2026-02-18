class Solution {
    public String reverseWords(String s) {
        s = s.replaceAll("\\s+"," ");
        s = s.trim();
        String arr[] = s.split(" ");
        int i=0;
        int j=arr.length - 1;
        while(i<j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        String str = String.join(" ", arr);
        return str;
    }
}