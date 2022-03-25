// https://leetcode.com/problems/length-of-last-word/
public class leet58 {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
        int st=-1,end=-1;
        for(int i=n;i>=0;i--){
            if(s.charAt(i)!=' ' && end==-1){
                end=i;
            }
            if(s.charAt(i)==' ' && end!=-1){
                st=i;
                break;
            }
            
        }
        return end-st;
    }
}
