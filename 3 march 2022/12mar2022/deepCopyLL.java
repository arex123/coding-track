/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
// https://leetcode.com/problems/copy-list-with-random-pointer/
class Solution {
    public Node copyRandomList(Node head) {
        /*
        How to approach this problem:
        so we have to simply deep copy the linkedlist,
        and listlist node has two address ,it is doubly linkedlist
        one pointer pointing to next node, and another pointer pointing to 
        at any random place.
        
        steps for solving this
        
        Assume we have a LL
        1 - 2 - 3 - 4 - 5
        
        we will make sudo node with it like
        1 - 1`- 2 - 2`- 3 - 3`- 4 - 4`- 5 - 5`
        
        we have made duplicate nodes and placed them in front of them,
        note that every node has two address one point to next node and 
        another pointing to random node
        
        Now lets closly look at the steps
        step 1: make above type LL(original node pointing to its duplicate node), this is to point the ans LL to its next node,
            In duplicate node only wright its next pointer address
        
        step 2: now in duplicate node write its random pointer address
        
        step 3: segregate the LL, in the basis of original and duplicate nodes now duplicate has its next pointer and random pointer also , copied node LL will be our ans LL
        
        
        
        */
        
        
        //step 1: make copy of each node,
        //and link them together side by side in single list
        //step 1: we are making LL 1-2-3 to 1-1`-2-2`-3-3`(node whose value is same as previous node and is pointing to next of its privious now and its privious is now pointing at this node)
        Node itr =  head;
        Node first = head;
        
        while(itr!=null){
            
            first = itr.next; //so this is next of itr, we will attach copied node to it
            
            Node copy = new Node(itr.val); //we have copied the val and made a new node
            //now we want to attach it to next node of itr, and 
            //and we want to attach itr to this copied(temp) node
            
            itr.next = copy;
            copy.next = first;
            
            itr = first; //updating itr to next node
            
        }
        
        
        //step 2: assigning random pointer to copy nodes
        
        itr = head;
        while(itr!=null){
            if(itr.random!=null){
                itr.next.random = itr.random.next;
            }
            itr = itr.next.next;
            
        }
        
        //step 3: extracting copy node List and also restoring the original List 
        
            
        itr  = head;
        Node dummy = new Node(0);
        Node temp = dummy;
        
        
        while(itr!=null){
            
            //putting copy node from list to ans list
            temp.next = itr.next;
            temp = temp.next;
            
            //restoring the original list
            itr.next = itr.next.next;//placing curr node to next to next node, we are ignoring middle node which is same duplicate copied node
            //by the we can store itr.next.next to some temp variable like striver ne jaisa kiya but still node need
            itr = itr.next;
            
            
        }
        
        
        return dummy.next;
        
    }
}














