class Solution {
    public int lengthOfLastWord(String s) {
        int length=0;
        int strLength=s.length();
        int index=strLength-1;
        if(s==null || s.isEmpty())
        {
            return 0;
        }
        while(index>0 && s.charAt(index)==' ')
        {
            index--;
        }
        while (index >= 0 && s.charAt(index) != ' ') {
            length++;
            index--;
        }
        return length;
    }
}