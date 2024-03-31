//brute force using stack;
// https://takeuforward.org/data-structure/reverse-a-doubly-linked-list/
import java.util.*;
class Node 
{
    int data;
    Node next;
    Node prev;

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class reverseDll 
{
    Node head;
    public static Node reverse(Node head)
    {
        
        Stack<Integer> st = new Stack<>();
        Node temp = head;

        while(temp != null)
        {
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(!st.isEmpty())
        {
            temp.data = st.peek();
            st.pop();
            temp = temp.next;
        }
        return head;




    }    

}
