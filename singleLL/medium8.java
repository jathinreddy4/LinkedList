//https://leetcode.com/problems/odd-even-linked-list/
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


public class medium8 
{
    static Node head;
    public static  Node oddeven(Node head)
    {
        Node odd = head;
        Node even = head.next;

        Node evenhead = even ;// to store the starting point of even nodes
        while(even != null && odd != null)
        {
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next; 
        }
        odd.next = evenhead; // assign the last off odd to first of even node
        return head;
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

    public static void main(String []args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Node");
        print(head);

        System.out.println("odd even sorted");
        head = oddeven(head);
        print(head);

    }

}
