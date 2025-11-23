class Solution {
    public String removeKdigits(String num, int k) {
        //Intution:keep the smaller digits at start and get rid of the K larger ones
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<num.length();i++)
    {
           int digit=num.charAt(i)-'0';
            while(!st.empty() && st.peek()>digit && k>0)
            {
                   st.pop();
                   k--;
            }
           st.push(digit);
    }
    while(!st.isEmpty() && k>0)
    {
        st.pop();
        k--;
    }
    String result="";
    while(!st.isEmpty())
    {
        result=String.valueOf(st.pop())+result;
    }
    int idx=0;
    while(idx<result.length() && result.charAt(idx)=='0')
    {
        idx++;
    }
     result=result.substring(idx);
     return result.isEmpty()?"0":result;
    }
}