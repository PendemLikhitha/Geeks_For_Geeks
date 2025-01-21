//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class ReverseInSize {
    static Node head;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());

        while (t-- > 0) {

            String s[] = in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < s.length; i++) {
                int a = Integer.parseInt(s[i]);
                // addToTheLast(new Node(a));
                tail.next = new Node(a);
                tail = tail.next;
            }

            int k = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            Node res = ob.reverseKGroup(head, k);
            printList(res, out);
            out.println();

            out.println("~");
        }
        out.close();
    }

    public static void printList(Node node, PrintWriter out) {
        while (node != null) {
            out.print(node.data + " ");
            node = node.next;
        }
    }
}

// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    public static Node reverseKGroup(Node head, int k) {
         if (head == null || k <= 1) return head;

        // Dummy node to simplify connections
        Node dummy = new Node(0);
        dummy.next = head;
        Node prevGroupEnd = dummy;

        while (true) {
            // Check if there are at least k nodes left
            Node groupStart = prevGroupEnd.next;
            Node groupEnd = prevGroupEnd;
            for (int i = 0; i < k && groupEnd != null; i++) {
                groupEnd = groupEnd.next;
            }

            if (groupEnd == null) {
                // Reverse the remaining nodes (if needed)
                prevGroupEnd.next = reverseRemaining(groupStart);
                break;
            }

            // Save the node after the group to reconnect later
            Node nextGroupStart = groupEnd.next;

            // Reverse the group
            reverse(groupStart, groupEnd);

            // Connect the reversed group
            prevGroupEnd.next = groupEnd;
            groupStart.next = nextGroupStart;

            // Move to the next group
            prevGroupEnd = groupStart;
        }

        return dummy.next;
    }

    private static void reverse(Node start, Node end) {
        Node prev = null, current = start, next = null;
        while (prev != end) { // Reverse until the end node
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
    }

    private static Node reverseRemaining(Node head) {
        Node prev = null, current = head, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
