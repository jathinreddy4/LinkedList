import java.util.*;
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
public class medium13 
{
    static Node head1;
    static Node head2;
    
    public static Node findIntersection(Node head1 ,Node head2)
    {
        //using hashing
        if(head1 == null)return head1;
        if(head2 == null)return head2;

        HashSet<Node> nd = new HashSet<>();
        // adding elements of ll1 into set
        while(head1 != null)
        {
            nd.add(head1);
            head1 = head1.next;
        }

        Node result  = null;
        //checking 
        while(head2 != null)
        {
            if(nd.contains(head1))
            {
                return head2;
            }
        }
        return result;
    }

    public static Node intersectio(Node head1,Node head2)
    {
        //most optimal solution 
        int lena = getListlength(head1);
        int lenb = getListlength(head2);

        while(lena > lenb)
        {
            lena--;
            head1 = head1.next;
        }

        while(lena < lenb)
        {
            lenb--;
            head2 = head2.next;
        }

        while(head1 != head2)
        {
            head1 = head1.next;
            head2 = head2.next;

        }
        return head1;
    }
    public static int  getListlength(Node head)
        {
            int length = 0;
            while(head != null)
            {
                length++;
                head = head.next;
            }
            return length;
        }
}
