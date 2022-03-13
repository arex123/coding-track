// https://leetcode.com/problems/valid-parentheses/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==')' || ch==']' || ch=='}'){
                if(st.size()==0){
                    return false;
                }
                
                if(ch==']'){
                    if(st.size()!=0 && st.peek()!='['){
                        return false;
                    }else{
                        st.pop();
                    }                    
                }
                if(ch=='}'){
                    if(st.size()!=0 && st.peek()!='{'){
                        return false;
                    }else{
                        st.pop();
                    }
                }
                if(ch==')'){
                    if(st.size()!=0 && st.peek()!='('){
                        return false;
                    }else{
                        st.pop();
                    }
                }
                
                
                
            }else{
                st.push(ch);
            }
        }
        if(st.size()!=0){
            return false;
        }
        return true;
        
        
    }
}