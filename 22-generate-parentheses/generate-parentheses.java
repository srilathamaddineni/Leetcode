class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        backTrack(result,"",0,0,n);
        return result;
    }
    public void backTrack(List<String> result, String curr, int openPar, int closePar,int n){
        if(openPar>n || closePar>openPar)
         return;
        if(closePar==n && openPar==n)
        {
            result.add(curr);

        }
        backTrack(result,curr+"(",openPar+1,closePar,n);
        backTrack(result,curr+")",openPar,closePar+1,n);
        
        }
}