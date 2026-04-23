class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<op.length;i++){
            if(op[i].equals("C")){
                st.pop();
            }
            else if(op[i].equals("D")){
                int num = st.pop(); 
                int nex = num*2;
                st.push(num);
                st.push(nex);
            }
            else if(op[i].equals("+")){
                 int num = st.pop();
                 int sum = st.peek()+num;
                 st.push(num);
                 st.push(sum);
            }
            else{
                int num = Integer.parseInt(op[i]);
                st.push(num);
            }
        }
         
        int s = st.size();
        int sum = 0;
        for(int j=0;j<s;j++){
            int num = st.pop();
            sum+=num;
        }
     return sum;
    }
}