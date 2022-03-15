// https://leetcode.com/problems/shortest-path-visiting-all-nodes/
class Solution {
    
    //node to maintain the queue
    //we are storing current node,distance travelled and nodes visited till
    //now through mask(setBits <<)
    
    class Node{
        int vis;
        int d;
        int node;
        Node(int node,int d,int vis){
            this.node = node;
            this.d = d;
            this.vis = vis;
        }
    }
    
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        
        Set<Integer>[] vis = new HashSet[n];
        
        Queue<Node> queue = new LinkedList<>();
        
        for(int i=0;i<n;i++){
            vis[i]=new HashSet<>();
            int mask = 1 << i; // this means if i=0, 00001 , 1st node is visited
                                // if i=5, 10000 means fifth node is visited 
            queue.add(new Node(i,0,mask)); // we are storing element, distance covered 0 for all at this moment, nodes visited till now
            vis[i].add(mask);
            
        }//we have stored all nodes in queue 
        
        //applying BFS
        
        int complete = (1<<n)-1; // all visited condition,
                            // 11111 , when we visited all nodes and value is 
                            // (2^n*1)-1 where n is total nodes
                            // (2^5*1)-1 = 31, (for example 2 in leetcode testcase)
        
        while(!queue.isEmpty()){
            Node node = queue.poll();
            
            if(node.vis==complete)
                return node.d;
            
            for(int nbr:graph[node.node]){
                int mask = node.vis | (1 << nbr);
                
                if(vis[nbr].add(mask))
                    queue.add(new Node(nbr,1+node.d,mask));
                
            }          
            
        }
        
        return -1;
        
        
        
        
        
        
        
        
    }
}