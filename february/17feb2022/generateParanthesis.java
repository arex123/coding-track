class Solution {
    // https://leetcode.com/problems/generate-parentheses/
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        parenth("(",1,0,n,ans); //1 means number of open brackets , jo ki lag gye h
                                    //and 0 means number of closed bracket 
                                    //max open and close brackets 2 hi lag sakte h 
                                    // dono ko milake 2+2= 4
        return ans;
    }
    void parenth(String st,int open,int closed,int n,List<String> ans){
        
        if(st.length()==2*n){
            ans.add(st);
            return;
        }
        
        if(open<n){
            parenth(st+"(",open+1,closed,n,ans);
        }
        if(closed<open){
            parenth(st+")",open,closed+1,n,ans);
        }
         
    }
}