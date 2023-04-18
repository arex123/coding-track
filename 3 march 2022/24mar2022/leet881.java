// https://leetcode.com/problems/boats-to-save-people/
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int i=0; // for checking from start
        int j=people.length-1;  // for checking from end
        while(i<=j){
            if(people[j]+people[i]<=limit){
                j--;
                i++;
            }else{                
                j--;
            }
            count++;
              
        }
        
        return count;
    }
}