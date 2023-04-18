public class rotatearray {
    
   /*   public void rotate(int[] nums, int k) {
           
              time: O(n),
              space: O(n)
          
           int n = nums.length;
           int[] ans = new int[n];
           int i=0;
           
           if(k>n){
               k=k%n;
           }
           
           if(n==1 || n==0 || n==k){
               return;
           }
           
           for(int t=n-k;t<n;t++){
               ans[i] = nums[t];
               i++;
           }
           // i=0;
           for(int t=0;t<n-k;t++){
               ans[i] = nums[t];
               i++;
           }
           
           for(int t=0;t<n;t++){
               nums[t] = ans[t];
           }
          
           
       }
   
   */
       
       //below code time: O(2n), and space O(1)
       public void rotate(int[] nums, int k) {
         int n = nums.length;
         if(k>n){
             k=k%n;
         }
         if(k==n || n==1) return;
           
         reverse(nums,0,n-k-1);
         reverse(nums,n-k,n-1);
         reverse(nums,0,n-1);
       
       }
       
   public void reverse(int[] nums,int lo,int hi){
          
        while(lo<hi){
            int temp = nums[lo];
            nums[lo] = nums[hi];
            nums[hi] = temp;
            lo++;
            hi--;
        }
       
       
       }
   }
