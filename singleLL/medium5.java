//https://leetcode.com/problems/linked-list-cycle-ii/
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


public class medium5 
{
    static Node head;
    public static Node findindex(Node head)
    {  
        Node slow = head;
        Node fast = head;

        while(slow != null && fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;

            if(slow == fast)
            {
                while(head != slow)
                {
                    head = head.next;
                    slow = slow.next;
                }
                return slow; // return the node where the loops starts. ok (index of the node)
            }
        }
        return null; // no loop exists
    }
}
