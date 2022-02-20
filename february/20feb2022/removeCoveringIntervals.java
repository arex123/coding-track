class Solution {
    // https://leetcode.com/problems/remove-covered-intervals/
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b)-> a[0]==b[0] ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]) );
        int cnt=0;
        int curr=-1;
        for(int[] a:intervals){
            
            if(a[1]>curr){
                // curr=a[1];
                cnt++;
            }
            curr = Math.max(curr,a[1]);
        }
        
        return cnt;
    }
}

// [[1,3],[2,8],[3,6],[4,8]]

// 