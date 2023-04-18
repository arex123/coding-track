// https://leetcode.com/problems/summary-ranges/
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList();

        if(nums.length==0)
            return list;
        
        list.add(nums[0]+"");
    
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]-1){
                String s = list.get(list.size()-1);
                
                if(nums[i-1]!=Integer.parseInt(s)){
                s=s+"->"+nums[i-1];
                list.set(list.size()-1,s);
                }
                list.add(nums[i]+"");
                
            }
            
        }
        
        if(list.size()>0){
            String str = list.get(list.size()-1);
            if(Integer.parseInt(str)!=nums[nums.length-1]){
                str=str+"->"+nums[nums.length-1];
                list.set(list.size()-1,str);
            }
            
        }
        
        return list;
        
    }
}