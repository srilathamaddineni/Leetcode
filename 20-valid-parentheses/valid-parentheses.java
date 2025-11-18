class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        Map<Character, Character> pairs=Map.of(
            ')','(',
            ']','[',
            '}','{'
        );
        for(char ch:s.toCharArray())
        {
            if(pairs.containsValue(ch))
            {
                st.push(ch);
                continue;
            }
            if(pairs.containsKey(ch))
            {
                if(st.isEmpty() || pairs.get(ch)!=st.pop())
                {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}