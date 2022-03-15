class Solution {
    // https://leetcode.com/problems/median-of-two-sorted-arrays/
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n = nums1.length,m=nums2.length;
        
        int[] merg = new int[n+m];
        System.arraycopy(nums1,0,merg,0,n);
        System.arraycopy(nums2,0,merg,n,m);
        Arrays.sort(merg);
        int t=n+m;
        if(merg.length%2==0){
            return (merg[t/2-1]+merg[t/2])/2d; //d for double
        }else{
            return merg[t/2]*1d;
        }
        
        
    }
}