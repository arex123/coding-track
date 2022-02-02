class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> ans = new ArrayList<>();
        if(p.length()>s.length()) {
            return ans;
        }
        
        HashMap<Character,Integer> pm = new HashMap<>();
        HashMap<Character,Integer> ss = new HashMap<>();
        
        for(char c:p.toCharArray()){
            pm.put(c,pm.getOrDefault(c,0)+1);
        }
        int pl = p.length();
        for(int i=0;i<pl;i++){
            ss.put(s.charAt(i),ss.getOrDefault(s.charAt(i),0)+1);
        }
        
        int j= p.length();
        
        while(j<s.length()){
            
            if(pm.equals(ss)){
                ans.add(j-p.length());
            }
            
            char ac = s.charAt(j); // add char in right side of window
            ss.put(ac,ss.getOrDefault(ac,0)+1);
            
            char rc = s.charAt(j-p.length()); //remove char from leftmost window
            if(ss.get(rc)==1){
                ss.remove(rc);
            }else{
                ss.put(rc,ss.get(rc)-1);
            }
            j++;
            
            
        }
        
        if(pm.equals(ss)){
            ans.add(j-p.length());
            
        }
        
        
        
        
        return ans;
        
        
    }
}