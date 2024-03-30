//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/#:~:text=You%20are%20given%20the%20head,than%20or%20equal%20to%20x%20.
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
public class medium10 
{
    static Node head;
    public static Node removemid(Node head)
    {
        Node slow = head;
        Node fast = head;
        Node prevslow = head;

        while(slow != null && fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            prevslow = slow;
            
        }
        prevslow.next = prevslow.next.next;
        return head;
    } 
    
    public static void print(Node head)
    {
        Node temp = head;
        while(temp!= null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(1);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next= new Node(6);

        System.out.println("LinkedList is : ");
        print(head);

        System.out.println("Mid of the list is : ");
        head = removemid(head);
        print(head);
    }


    
}
