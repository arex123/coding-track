class Solution {
    public String minWindow(String s, String t) {
        // aa
        // aa
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:t.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0)+1 );
        }
        
        int n = s.length();
        int st = 0, e = 0 ;
        int minlength = Integer.MAX_VALUE;
        int minstart = 0;
        int count = t.length();
       
        while(e<n){
            char ch = s.charAt(e);
            if(hm.containsKey(ch)){
                
                if(hm.get(ch)>0){
                    count--;
                }
            hm.put(ch,hm.get(ch)-1);

            // System.out.println(count);
                
                
            }
            
            while(count==0){
                // System.out.println("count 0");
                if(minlength>e-st){
                    minlength = e-st;
                    minstart = st;
                }
                
                char lc = s.charAt(st); //left character
                st++;
                if(hm.containsKey(lc)){
                    
                    hm.put(lc,hm.get(lc)+1);
                    
                    if(hm.get(lc)>0){
                        count++;
                    }
                    
                }
                
            }
            
            e++;
        }
       
    
        return minlength==Integer.MAX_VALUE?"":s.substring(minstart,minstart+minlength+1);
    }
}