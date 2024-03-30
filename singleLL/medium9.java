//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
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

public class medium9 
{
    static Node head;
    public static Node deletenode(Node head, int n)
    {
        Node dummy = new Node(-1);
        dummy.next = head;

        Node firstptr = dummy;
        Node secondptr = dummy;

        //move second pointer to n places
        for(int i=0; i<n; i++)
        {
            secondptr = secondptr.next;
        }

        //move both the pointer until secondptr.next is null
        while(secondptr.next != null)
        {
            firstptr = firstptr.next;
            secondptr = secondptr.next;
        }

        //assigin the firstptr.next as next of next to delete to middle elememt in between them that is  nth element
        firstptr.next = firstptr.next.next;
        return dummy.next;

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
        int n = 2;
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        print(head);

        head = deletenode(head, n);
        print(head);

        

    }
}
