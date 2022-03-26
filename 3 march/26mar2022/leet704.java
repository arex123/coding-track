// https://leetcode.com/problems/binary-search/
public class leet704{
public int search(int[] nums, int target) {
        
    int n = nums.length;
    int st = 0, end = n-1;
    
    while(st<=end){            
    
    int mid = (st+end)/2;
    
    if(nums[mid]>target){
    
        end = mid-1;
        
    }else if(nums[mid]<target){
        
        st = mid+1;
        
    }else if(nums[mid]==target){
        return mid;
    }
        
    }
    
    return -1;
    
}}