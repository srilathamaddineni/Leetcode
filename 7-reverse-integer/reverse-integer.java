class Solution {
    public int reverse(int x) {
        int sign=0;
        int answer=0;
        if(x<0)
        {
            sign=1;
            x=Math.abs(x);
        }
        while(x>0)
        {
            int ld=x%10;
            if(answer>(Integer.MAX_VALUE-ld)/10)
              return 0;
            answer=answer*10+(x%10);
            x=x/10;
        }
        return sign==1?(-answer):answer;
    }
}