// TC: O(n)
// SC: O(n)
class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> st = new Stack<>();
    
        for(int i=0;i<tokens.length;i++){
                 if(tokens[i].equals("+")){
                int a = st.pop();
                int b = st.pop();
                    st.push(a+b);
                }else if (tokens[i].equals("*")){
                    int a = st.pop();
                int b = st.pop();
                    st.push(a*b);
                }else if (tokens[i].equals("/")){
                    int a = st.pop();
                int b = st.pop();
                    st.push(b/a);
                }else if (tokens[i].equals("-")){
                    int a = st.pop();
                int b = st.pop();
                    st.push(b-a);
                }else{
               st.push(Integer.valueOf(tokens[i])); 
            }
        }
        if(!st.isEmpty()){
            return st.pop();
        }
        return 0;
    }
}