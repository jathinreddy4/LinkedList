
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

public class medium4
{   
    public static  boolean checkloop(Node head) 
    {
        Node fast = head;
        Node slow = head;

        while(slow != null && fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;

            if(slow == fast)
            {
                return true;
            }
        }
        return false;
    } 
   

    public static void main(String[]args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        boolean hasLoop = checkloop(head);
        if (hasLoop) {
            System.out.println("The linked list has a loop.");
        } else {
            System.out.println("The linked list does not have a loop.");
        }
 
    }
}
