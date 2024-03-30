//link https://www.geeksforgeeks.org/problems/remove-duplicates-from-a-sorted-doubly-linked-list/1
class Node
{
    int data;
    Node next;
    Node prev;

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class medium3Dll
{
    static Node head;
    public static Node delete(Node head)
    {
        // this code passed 10000 testcases
        Node current = head;
        Node nextnode;
        while(current != null && current.next != null)
        {
            nextnode = current.next;
            while(nextnode != null && current.data == nextnode.data)
            {
                nextnode = nextnode.next;
            }
            current.next = nextnode;

            if(nextnode != null)
            {
                nextnode.prev = current;
            }
            current = current.next;
        }
        return head;

        //this code failed for multiple cases ,coded byself
        /* 
        Node current  = head;
        Node nextnode = current.next;
        while(current != null && nextnode != null && current.data == nextnode.data)
        {
           nextnode = nextnode.next;
           
           if(current.data != nextnode.data)
           {
               current.next = nextnode;
           }
            
            if(nextnode.next != null)
            {
                nextnode.prev = current;
                
            }
            else
            {
                current = current.next;
            }
        }
        
        return head;
*/

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
    

    public static void main(String[]args)
    {
        head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(2);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(3);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.prev = head.next.next.next;
        
        print(head);

        head = delete(head);
        print(head);

    }


}