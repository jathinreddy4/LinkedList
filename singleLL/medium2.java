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

public class medium2 
{   // function to reverse a LL.
    public static Node reversed(Node head) 
    {
        if(head == null)
        {
            return null;
        }   

        if(head.next == null)
        {
            return head;
        }

        Node current  = head;
        Node prenode = null;
        while(current != null)
        {
            Node nextnode = current.next;
            current.next = prenode;
            prenode = current;
            current = nextnode;
        }
        head  = prenode;
        return head;
    } 
    //function to display
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

    public static void main(String[]args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.println("original list");
        print(head);

        //reverse the linked list
        System.out.println("reversed list");
        head = reversed(head);
        print(head);
    }
}
