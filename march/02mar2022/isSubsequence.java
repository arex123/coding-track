// https://leetcode.com/problems/is-subsequence/
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;
        int i=0,j=0;
        for(;i<t.length();i++){
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }
            if(j==s.length())
                return true;
        }
        return false;
    }
}