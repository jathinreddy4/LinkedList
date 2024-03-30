import java.util.Stack;
//https://leetcode.com/problems/palindrome-linked-list/
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}


public class midseven
{
    static Node head;
    public static boolean ispalindrome(Node head)
    {
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while(temp != null)
        {
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(temp != null)
        {
            if(temp.data != st.peek())
            {
                return false;
            }
            st.pop();
            temp = temp.next;

        }
        return true;
    }

    public static void main(String args[]) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        if (ispalindrome(head)) {
            System.out.println("the LL is palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}