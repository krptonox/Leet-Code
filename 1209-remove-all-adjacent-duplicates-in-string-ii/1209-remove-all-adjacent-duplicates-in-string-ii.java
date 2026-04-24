class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st = new Stack<>();

        for(char ch : s.toCharArray()){
           if(!st.isEmpty() && st.peek()[0]==ch){
             st.peek()[1]++;
           }
           else{
            st.push(new int[]{ch,1});
           }

           if(st.peek()[1]==k){
            st.pop();
           }
        }

        StringBuilder sb = new StringBuilder();
        for(int[] pair : st){
            char ch = (char) pair[0];
            int count = pair[1];

            while(count-->0){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}