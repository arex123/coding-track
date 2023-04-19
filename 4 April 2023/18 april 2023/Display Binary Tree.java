// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
   
    //step 2 : create a node class
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data,Node left,Node right){
            this.data = data;
            this.left = left;
            this.right = right;
            
        }
    }
    

    //step 3: create pair class
    public static class Pair{
        Node node;
        int state;
        Pair(Node node,int state){
            this.node = node;
            this.state = state;
        }
    }
    

    public static void display(Node node){
        if(node==null)
            return;

        String str = "";
        str += node.left==null?"null ":node.left.data+"";
        str += " <- "+node.data+" -> ";
        str += node.right==null?"null ":node.right.data+"";

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    //** step 1: create main function, create array for binary tree elements */
    public static void main(String args[]){

        Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};

        Node root = new Node(arr[0],null,null);
        Pair pair = new Pair(root,1);

        //state 1 means, now we have to go to the left of the node
        //state 2 means. now we have to go to the right of the node
        //state 3 means, node does not have left and right go back so pop node from state

        Stack<Pair> st = new Stack<>();

        st.push(pair);

        int idx = 0;
        while(st.size()>0){

            Pair top = st.peek();
            if(top.state==1){
                idx++;

                if(arr[idx]==null){
                    top.node.left = null;
                }else{
                    top.node.left = new Node(arr[idx],null,null);


                    Pair lp = new Pair(top.node.left,1);
                    st.push(lp);
                }

                top.state++;

            }else if(top.state ==2 ){

                if(arr[idx]==null){
                    top.node.right = null;
                }else{
                    top.node.right = new Node(arr[idx],null,null);

                    Pair rp = new Pair(top.node.right,2);
                    st.push(rp);
                }

                top.state++;

            }else{
                st.pop();
            }

        }

display(root);
    


    }
}