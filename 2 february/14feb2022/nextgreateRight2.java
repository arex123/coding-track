class Solution {
    // https://leetcode.com/problems/next-greater-element-ii/
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        
        /* step1: to initialy ek baad hum right side se stack mai ngr push kara dete h 
        */
        
        st.push(nums[n-1]);
        
        for(int i=n-2;i>=0;i--){
            
            while(st.size()>0 && st.peek()<=nums[i]){
                st.pop();
            }
            st.push(nums[i]);
        
            
        }
        /* 
        step 2: fir normally stack se ngr ans[] mai store kara dete h
        */
        
        int[] ans = new int[n];
        
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && st.peek()<=nums[i]){
                st.pop();
            }
            
            if(st.size()==0){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(nums[i]);
            
            
        }
        
        
        return ans;
        
    }
}