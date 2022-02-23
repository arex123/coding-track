/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    // https://leetcode.com/problems/clone-graph/
    HashMap<Node,Node> hm = new HashMap();
    
    public Node cloneGraph(Node node) {
        
        return dfs(node) ;
           
    }
    
    public Node dfs(Node node){
        
        if(node==null) return null;
        
        Node newnode = new Node(node.val);
        hm.put(node,newnode);
        
        for(int i=0;i<node.neighbors.size();i++){
            if(hm.containsKey(node.neighbors.get(i))){
                newnode.neighbors.add(hm.get(node.neighbors.get(i)));
            }else{
                newnode.neighbors.add(dfs(node.neighbors.get(i)));
            }
            
            
        }
        
        return newnode;
        
        
    }
    
    /*  
    
    
            1-1'
    */
    
    
    
    
}