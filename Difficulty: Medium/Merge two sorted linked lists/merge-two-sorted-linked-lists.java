/*
  Node is defined as
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node dummy = new Node(-1);
        Node cur = dummy;
        while(head1 != null && head2!= null){
            if(head1.data <= head2.data){
                cur.next = head1;
                head1 = head1.next;
            }
            else{
                cur.next = head2;
                head2= head2.next;
            }
            cur = cur.next;
        }
        if(head1 != null){
            cur.next = head1;
        }
        if(head2 != null){
            cur.next = head2;
        }
        return dummy.next;
    }
}