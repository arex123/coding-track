class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>(); // <Sum, Index>
        int sum = 0;
        hm.put(0,-1);
        int maxSubLen = 0;
        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i]==0?-1:1;
            
            if(hm.containsKey(sum)){
                
                if(maxSubLen<i-hm.get(sum)){
                    maxSubLen = i-hm.get(sum);
                }
                
            }else{
                hm.put(sum,i);
            }
            
            
        }
        
        return maxSubLen;
        
    }
}