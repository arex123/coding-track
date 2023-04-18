// https://leetcode.com/problems/maximum-frequency-stack/
/*

/* use a stackList with stackList[i] store elements that appears i + 1 times
 * use a map to update the frequency of each element
 * in the case of 
 * ["FreqStack","push","push","push","push","push","push","pop","pop","pop","pop"],
 * [[],[5],[7],[5],[7],[4],[5],[],[],[],[]]
 * ========================================
 * push 5
 * stackList: stackList[0]: 5
 * ========================================
 * push 7
 * stackList: stackList[0]: 5  7
 * ========================================
 * push 5
 * stackList: stackList[0]: 5  7
 *            stackList[1]: 5
 * ========================================
 * push 7
 * stackList: stackList[0]: 5  7
 *            stackList[1]: 5  7
 * ========================================
 * push 4
 * stackList: stackList[0]: 5  7  4
 *            stackList[1]: 5  7
 * ========================================
 * push 5
 * stackList: stackList[0]: 5  7  4
 *            stackList[1]: 5  7
 *            stackList[2]: 5
 * ========================================
 * pop (will pop the top element of stackList[2], which is 5)
 * stackList: stackList[0]: 5  7  4
 *            stackList[1]: 5  7
 * ========================================
 * pop (will pop the top element of stackList[1], which is 7)
 * stackList: stackList[0]: 5  7  4
 *            stackList[1]: 5
 * ========================================
 * pop (will pop the top element of stackList[1], which is 5)
 * stackList: stackList[0]: 5  7  4
 * ========================================
 * pop (will pop the top element of stackList[0], which is 4)
 * stackList: stackList[0]: 5  7
 */
*/
class FreqStack {
    
    List<Stack<Integer>> stlist; //stack list
    Map<Integer,Integer> map;
    public FreqStack() {
        stlist = new ArrayList();
        map = new HashMap<Integer,Integer>();
        
    }
    
    public void push(int val) {
        if(!map.containsKey(val)){
            map.put(val,0);
        }
        
        map.put(val,map.get(val)+1);
        if(stlist.size()<map.get(val)){
            stlist.add(new Stack<Integer>());
        }
        stlist.get(map.get(val)-1).push(val);
        
    }
    
    public int pop() {
        int res = stlist.get(stlist.size()-1).pop();
        map.put(res,map.get(res)-1);
        if(stlist.get(stlist.size()-1).isEmpty()){
            stlist.remove(stlist.size()-1);
        }
        return res;
        
    }
}

/*
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */