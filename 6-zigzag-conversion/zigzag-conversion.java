class Solution {
    public String convert(String s, int n) {
        /*char zigzag[][]=new char[n][s.length()];
        int k=0;
        int j=0;
        int pos=0;
        while(pos<s.length())
        {
            for(int i=0;i<n && pos<s.length();i++)
            {
               zigzag[i][j]=s.charAt(pos++);
            }
            j++;
            int row=n-2;
            while(row>0 && pos<s.length())
            {
                zigzag[row--][j++]=s.charAt(pos++);
            }    
        }
        String res="";
        for(int i=0;i<n;i++)
        {
            for(int p=0;p<zigzag[i].length;p++)
            {
                if(zigzag[i][p]!='\0')
                {
                    res+=zigzag[i][p];
                }
            }
        }
        return res;*/
        if(n==1 || n>s.length())
        {
            return s;
        }
        List<Character> rows[]=new ArrayList[n];
        for (int i = 0; i < n; i++) {
              rows[i] = new ArrayList<>();
          }
        int idx=0;
        int d=1;
        for(char c:s.toCharArray())
        {
            rows[idx].add(c);
            if(idx==0)
            {
                d=1;
            }
            else if(idx==n-1)
            {
                d=-1;
            }
            idx+=d;
        }
     StringBuilder res=new StringBuilder();
     for(List<Character> row:rows)
     {
        for(char c:row)
        {
            res.append(c);
        }
     }
     return res.toString();
        
    }
}