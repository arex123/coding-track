class Solution {
    // https://leetcode.com/problems/majority-element-ii/
    public List<Integer> majorityElement(int[] nums) {

        int num1=-1,num2=-1;
        int c1=0,c2=0;
        for(int n:nums){
            if(num1==n){
                c1++;
            }else if(num2==n){
                c2++;
            }else if(c1==0){
                num1=n;
                c1=1;
            }else if(c2==0){
                num2=n;
                c2=1;
            }else{
                c1--;
                c2--;
            }
            
        }
        List<Integer> ans = new ArrayList();
        int count1=0;
        int count2=0;
        for(int n:nums){
            if(n==num1){
                count1++;
            }else if(n==num2){
                count2++;
            }
        }
        
        if(count1>nums.length/3)
            ans.add(num1);
        
        if(count2>nums.length/3)
            ans.add(num2);

        return ans;
        
        
        
    }
}