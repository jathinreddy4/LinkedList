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
Node head;

public class medium5 
{
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
        return null // no loop exists
    }
}
