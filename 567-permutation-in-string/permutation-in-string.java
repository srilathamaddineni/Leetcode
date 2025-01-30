class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1=s1.length();
        int len2=s2.length();
        if(len2<len1)
          return false;
        int i=0;
        char[] sorteds1=s1.toCharArray();
        Arrays.sort(sorteds1);
        String sortedStr1=new String(sorteds1);
        while(len2-i>=len1)
        {
            String substr=s2.substring(i,i+len1);
            char[] sorteds2=substr.toCharArray();
            Arrays.sort(sorteds2);
            String sortedStr2=new String(sorteds2);

            if(sortedStr1.equals(sortedStr2))
            {
                return true;
            }
          i++;
        }
        return false;
    }
}