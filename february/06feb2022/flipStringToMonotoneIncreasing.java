class Solution {

    //its like an algorithm
    public int minFlipsMonoIncr(String s) {
        
        int pre = 0;
        int flip = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                pre++;
            }else if(s.charAt(i)=='0' && pre>0){
                pre--;
                flip++;
            }
            
        }
        return flip;
        
    }
}