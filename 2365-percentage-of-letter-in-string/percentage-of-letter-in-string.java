class Solution {
    public int percentageLetter(String s, char letter) {
        int n=s.length();
        double cnt=0;
        for(int i=0;i<n;i++)
        {
           if(s.charAt(i)==letter)
           {
             cnt++;
           }
        }

        System.out.println(cnt);
        double value=cnt/n;

        return (int)(value*100);
    }
}