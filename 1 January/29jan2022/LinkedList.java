
class LinkedList {
    // Function to merge two sorted linked list.
    Node sortedMerge1(Node head1, Node head2) {
        // This is a "method-only" submission.
        // You only need to complete this method

        Node ans = new Node(-1);
        Node temp = ans;
        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        if (head1 != null) {
            temp.next = head1;
        }
        if (head2 != null) {
            temp.next = head2;
        }
        return ans.next;

    }

    public Node SortedMerge(Node A, Node B) {

        if (A == null)
            return B;
        if (B == null)
            return A;

        if (A.data < B.data) {
            A.next = SortedMerge(A.next, B);
            return A;
        } else {
            B.next = SortedMerge(A, B.next);
            return B;
        }

        /*
         * time o(n)
         * space o(n) stack in recursion
         * 
         * Auxiliary space is temporary or extra space used by an algorithm. This
         * temporary space allocated in order to solve the problem. Space complexity is
         * total space taken by the algorithm with respect to the input size.
         * 
         */

    }
}
