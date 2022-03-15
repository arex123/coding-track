class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
// problem name : rootToLeafSumPath 
/* for running binary tree problem make this fomate:
    
    class name should be BinaryTree 
    and under it write ->Node root; <- like below code
    and outside Node class should also present 
    this is necessary to make Node.class and BinaryTree.class

    after we make BinaryTree.class and Node.class we can make other program rum under any name by using
    BinaryTree functionality

*/
public class BinaryTree {
    Node root;
    // Node root;
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
 
        
        /* Constructed binary tree is
        10
        /  \
        8     2
        / \   /
        3   5 2
        */
 
        int sum = 20;
        if (tree.hasPathSum(tree.root, sum))
        System.out.println(
            "There is a root to leaf path with sum "
            + sum);
    else
        System.out.println(
            "There is no root to leaf path with sum "
            + sum);
        
    }
    boolean hasPathSum(Node root, int s) {
        // Your code here
        int subs = s-root.data;
        if(subs==0 && root.left==null && root.right==null){
            return true;
        }
        
        boolean ans = false;
        
        if(root.left!=null){
            ans = ans || hasPathSum(root.left,subs);
        }
        if(root.right!=null){
            ans = ans || hasPathSum(root.right,subs);
        }
        
        return ans;
        
    }
}
