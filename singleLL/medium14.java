// Normal solution
// time complexity = O(3N)
//https://www.codingninjas.com/studio/problems/add-one-to-a-number-represented-as-linked-list_920557?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
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

public class medium14 
{
    Node head;
    public static Node reverse(Node head)
    {
        Node current = head;
        Node prenode = null;

        if(head == null)
        {
            return null;
        }
        if(head.next == null)
        {
            return head;
        }

        while(current != null)
        {
            Node nextnode = current.next;
            current.next = prenode;
            prenode = current;
            current = nextnode;
        }
        head = prenode;
        return head;
    }    

    public static Node addone(Node head)
    {
        head = reverse(head);
        Node temp = head;
        int carry =1;
        while(temp != null)
        {
            temp.data = temp.data + carry;

            if(temp.data < 10)
            {
                carry = 0;
                break;
            }
            else
            {
                carry = 1;
                temp.data = 0;
            }
            temp = temp.next;
        }

        if(carry == 1)
        {
            Node newnode = new Node(1);
            
            newnode.next = head;
            head= newnode;
        }
        head = reverse(head);
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

    public static void main(String[] args) 
    {
        Node head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(9);
        
        System.out.println("original LL ");
        print(head);

        System.out.println("Linked list after adding one ");
        head = addone(head);
        print(head);
    }

}
