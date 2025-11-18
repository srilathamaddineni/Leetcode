class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
            if("+/-*".contains(tokens[i]))
            {
                int b=st.pop();
                int a=st.pop();
                   
                switch(tokens[i])
                {
                    case "+":st.push(a+b);break;
                    case "-":st.push(a-b);break;
                    case "*":st.push(a*b);break;
                    case "/":st.push(a/b);break;

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