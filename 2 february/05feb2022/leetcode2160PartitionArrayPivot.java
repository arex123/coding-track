class Solution {
    // 2161. Partition Array According to Given Pivot

    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> s = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();
        int eq = 0;
        for(int n:nums){
            if(n<pivot){
                s.add(n);
            }else if(n>pivot){
                l.add(n);
            }else{
                eq++;
            }
        }
        int len = s.size()+l.size()+eq;
        int[] ans = new int[len];
        int p=0;
        for(int i=0;i<s.size();i++){
            ans[i]=s.get(i);
            p++;
        }
        while(eq-->0){
            ans[p]=pivot;
            p++;
        }
        for(int i=0;i<l.size();i++){
            ans[p]=l.get(i);
            p++;
        }
        return ans;
        
    }
}