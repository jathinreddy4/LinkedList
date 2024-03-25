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

public class medium1
{
    public static Node findmid(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(slow.next != null && fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static void print(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("LinkedList is : ");
        print(head);

        System.out.println("Mid of the list is : ");
        head = findmid(head);
        print(head);
    }
}