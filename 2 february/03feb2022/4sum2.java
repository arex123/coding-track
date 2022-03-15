class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        // int i=0,j=0,k=0,l=0;
        int count=0;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int n1:nums1){
            for(int n2:nums2){
                hm.put(n2+n1, hm.getOrDefault(n2+n1,0));
            }
        }
        
        for(int n3:nums3){
            for(int n4:nums4){
                count+=hm.getOrDefault( -(n3+n4) , 0 );
            }
        }
        
        return count;
    }
}