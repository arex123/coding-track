class Solution {
    // https://leetcode.com/problems/remove-k-digits/
    public String removeKdigits(String num, int k) {
        if(k==num.length())  //this is for test case num="10", k=2
            return "0";
        Stack<Character> st = new Stack<>();

        for(int i=0;i<num.length();i++){
            char val = num.charAt(i);
            while(k>0 && !st.isEmpty() && st.peek()>val){
                st.pop();
                k--;
            }
            st.push(val);
        }
        while(k>0){
            st.pop();
            k--;
        }
        
        //construct new number using stack
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
            sb.append(st.pop());
        sb.reverse();
        
        //removing leading zeroes, if present like 00122
        while(sb.length()>1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.toString();
        
        
    }
}