class Solution {
    public char findTheDifference(String s, String t) {
        int sum=0;
        for(char tc:t.toCharArray()){
            sum+=(int)tc;
        }
        for(char sc:s.toCharArray()){
            sum-=(int)sc;
        }
        return (char)sum;
    }
}