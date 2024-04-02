class Node
{
    int data;
    Node next;

    Node (int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class hard2 
{
    Node head;
    public static Node rotate(Node head, int k)
    {
        if(head == null && head.next == null)
        {
            return head;
        }
        Node prev = head;
        Node current = head;
        for(int i=0; i<k; i++)
        {
            
            while(current.next != null)
            {
                current = current.next;
                current.next = prev;
                head = current;
            }
        }
        return head;
        
    }    

    public static void print(Node head)
    {
        Node  temp = head;
        while(temp!= null)
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
        head.next.next.next.next = new Node(5);

        int k = 2;
        print(head);

        System.out.println("rotated list :");
        head = rotate(head, k);
        System.out.println(head);
        
    }
}
