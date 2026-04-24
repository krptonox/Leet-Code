class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();
        for(int i=0;i<s.length();i++){
           char chk = s.charAt(i);
           if(!st.isEmpty() && chk=='#'){
               st.pop();
           }
           else{
            if(chk!='#'){
            st.push(chk);
            }
           }
        }
        
        for(int i=0;i<t.length();i++){
           char chk = t.charAt(i);
           if(!st1.isEmpty() && chk=='#'){
               st1.pop();
           }
          else{
            if(chk!='#'){
            st1.push(chk);
            }
           }
        }
        int count = 0;
        System.out.println(st1.size()+" "+ st.size());
        boolean size = false;
        int s01 = st.size();
        if(st.size()==st1.size()){
            int s0 = st.size();
            size = true;
            for(int i=0;i<s0;i++){
                char st11 = st1.pop();
                char st2 = st.pop();
                if(st11==st2){
                    count++;
                    System.out.print(st11+" "+st2);
                }
            }
        }
        if(size){
            if(count==s01) return true;
        }    
        return false;
        // if (st.size() == st1.size()) {
        //     int s0 = st.size();
        //     int count = 0;

        // for (int i = 0; i < s0; i++) {
        //     char a = st.pop();
        //     char b = st1.pop();

        //    if (a == b) {
        //        count++;
        //     }
        // }

        //  if (count == s0) return true;
        // }

        //  return false;
    }
}