class Solution {
    // https://leetcode.com/problems/majority-element/
 
    /*1 approach uwing algorithm*/
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> set = new HashMap<>();
        int count=0;
        int value=0;
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            set.put(n,set.getOrDefault(n,0)+1);
            if(set.get(n)>count){
                value=n;
                count=set.get(n);
            }
        }
        
        return value;
    }
/*2 approach using sorting*/ 
public int majorityElement(int[] nums) {
        
    Arrays.sort(nums);
    return nums[nums.length/2];
}

/*3 approach in o(1) by moore's voting algorithm'*/ 
public int majorityElement(int[] nums) {
        
    int ele=0;
    int cnt=0;
    for(int n:nums){
        if(cnt==0){
            ele=n;
        }
        
        if(ele==n){
            cnt++;
        }else{
            cnt--;
        }
        
    }
    return ele;
    
}

}