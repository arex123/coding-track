class Solution {
    
    //take it as an algorithm: https://www.youtube.com/watch?v=Aga-im0K5MY
    public int minimumDeletions(String s) {
        int n = s.length();
        int pre = 0;
        int del = 0;
        
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a' && pre>0){
                pre--;
                del++;
            }else if(s.charAt(i)=='b'){
                pre++;
            }
            
            
        }
        
        return del;
        
    }
}