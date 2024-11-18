class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            if(tokens[i].equals("*") || tokens[i].equals("+") || tokens[i].equals("/") || tokens[i].equals("-"))
            {
                int b=st.pop();
                int a=st.pop();
                int c=0;
                if(tokens[i].equals("*"))
                {
                  c=a*b;
                }
                if(tokens[i].equals("+"))
                {
                  c=a+b;
                }
                if(tokens[i].equals("/"))
                {
                  c=a/b;
                }
                if(tokens[i].equals("-"))
                {
                  c=a-b;
                }
                st.push(c);
            }
            else
            {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}