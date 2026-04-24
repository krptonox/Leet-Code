class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        Stack<String> st = new Stack<>();
        for(int i=0;i<logs.length;i++){
            if(!st.isEmpty() && logs[i].equals("../")){
                st.pop();
                count--;
            }
            else if(!st.isEmpty() && logs[i].equals("./")){
                continue;
            }
            else if(!logs[i].equals("./") && !logs[i].equals("../")){
                st.push(logs[i]);
                count++;
            }
        }
        return count;
    }
}