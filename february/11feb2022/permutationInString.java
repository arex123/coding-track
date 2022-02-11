class Solution {
    // https://leetcode.com/problems/permutation-in-string/
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n>m){
            return false;
        }
        HashMap<Character,Integer> fmap = new HashMap<>(); // first hashmap for s1 string
        for(char ch:s1.toCharArray()){
            fmap.put(ch,fmap.getOrDefault(ch,0)+1);
        }
        
        HashMap<Character,Integer> smap = new HashMap<>();
        int j = n;
        while(j-->0){
            smap.put(s2.charAt(j),smap.getOrDefault(s2.charAt(j),0)+1);
        }
        j=n;
        while(j<m){
            if(smap.equals(fmap)) return true;
            
            smap.put(s2.charAt(j),smap.getOrDefault(s2.charAt(j),0)+1);
            
            char rc = s2.charAt(j-n); // remove char from left most window 
            smap.put(rc,smap.get(rc)-1);
            if(smap.get(rc)==0) smap.remove(rc);
            
            j++;
        }
        
        if(smap.equals(fmap)) return true;
        
        return false;
        
        
        
    }
}