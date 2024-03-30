// https://www.codingninjas.com/studio/problems/find-length-of-loop_8160455?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
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


public class medium6 
{
    public static int findlength(Node slow, Node fast)
    {
        int count = 1;
        fast = fast.next;
        while(slow != fast)
        {
            count++;
            fast = fast.next;
        }
        return count;
    }
    
    public static int length(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(slow != null && fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                return findlength(slow ,fast);
            }
        }
        return 0;
    }    
}
