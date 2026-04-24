class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && ch==st.peek()){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
         
        return sb.toString();
    }
}
