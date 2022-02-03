class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        
        HashMap<Character,Integer> hm = new HashMap<>();
        
        int st = 0;
        int e=0;
        for(e=0;e<s.length();e++){
            char ch = s.charAt(e);
            
            while(hm.containsKey(ch)){
               
                char fc = s.charAt(st);
                
                hm.remove(fc);
                st++;

            }
            
            hm.put(ch,1);
            
         max = Math.max(max,e-st+1);
        }                
        return max;
    }
}