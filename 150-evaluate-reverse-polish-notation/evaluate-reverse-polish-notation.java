class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int result=0;
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/"))
            {
                int b=st.pop();
                int a=st.pop();
                   
                if(tokens[i].equals("+"))
                {
                   result=a+b;
                   st.push(result);
                }
                else if(tokens[i].equals("-"))
                {   result=a-b;
                    st.push(result);
                }
                 else if(tokens[i].equals("*"))
                {
                    result=a*b;
                    st.push(result);
                }
                else
                {
                    result=a/b;
                  st.push(result);
                }

            }
            else
            {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}