class Solution {
    // https://leetcode.com/problems/next-greater-element-iii/
    public int nextGreaterElement(int n) {
        
        //make number n a string then make string to char array
        char[] nums = (n+"").toCharArray();
        
        int i;
        for(i = nums.length-1;i>0;i--){
            if(nums[i-1]<nums[i])
                break;            
        }
        
        //this means above for loop didn't run, and n contains only single number
        //or n is sorted in descending order ex: 4321, we cannot find bigger number
        //containing only these(4321) digits
        if(i==0) return -1;
        
        //lets save the smaller number and we have to find bigger number right side, so that we 
        //can swap both number and make new bigger number containing given same digits
        int x = nums[i-1];
        
        int ps = i; // potential swap index
            
        //we have setted j to next index of smaller 
        for(int l=nums.length-1;l>i;l--){
            if(nums[l]>x && nums[l]<=nums[ps])
            {
                //found bigger num from right side so swap it, it will make bigger number
                //than n with same given 
                ps=l;
            }
        }
       
        char temp = nums[ps];
        nums[ps] = nums[i-1];
        nums[i-1]=temp;
        
        //sort values after i so that we can find effectively bigger number
        Arrays.sort(nums,i,nums.length);

        
        
        try{
            return Integer.valueOf(String.valueOf(nums));
        }catch(NumberFormatException e){
            return -1;
        }
        
        
        
        
        
        
        
        
        
    }
}