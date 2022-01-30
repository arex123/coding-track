class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int n = nums.length;
        // for(int i=1;i<n;i++){
        //     if(nums[i]!=nums[i-1]){
        //         k++;
        //     }
        // }
        
        int i=0,j=1;
        while(j<n){
            if(nums[i]==nums[j]){
                j++;
            }else{
                nums[i+1] = nums[j];
                j++;
                i++;
                k++;
            }
            
        }
        
        return k;
    }
}