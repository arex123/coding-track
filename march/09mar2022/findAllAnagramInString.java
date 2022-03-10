class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(p.length()>s.length()) return ans;
      
        HashMap<Character,Integer> ps = new HashMap<>();
        for(Character pc:p.toCharArray()){
            ps.put(pc,ps.getOrDefault(pc,0) + 1 );
        }
        
        HashMap<Character,Integer> ss = new HashMap<>();
        int j = p.length();
        while(j-->0){
            ss.put(s.charAt(j),ss.getOrDefault(s.charAt(j),0)+1);
        }
        j=p.length();
        while(j<s.length()){
            if(ss.equals(ps)){
                ans.add(j-p.length());
            }
            
            char nc = s.charAt(j); // adding new Char from right side of window
            ss.put(nc,ss.getOrDefault(nc,0)+1);
            
            //removing from left side of window
            char rc = s.charAt(j-p.length());
            if(ss.get(rc)==1){
                ss.remove(rc);
            }else{
                ss.put(rc,ss.get(rc)-1);
            }
            j++;
        }
        if(ss.equals(ps)) ans.add(j-p.length());
        
        return ans;
    }
}