
// https://www.naukri.com/code360/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list_8160461?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
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

public class medium1Dll {
    static Node head;
    public static Node deletenode(Node head, int key)
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == key)
            {
                if(temp == head)
                {
                    head = head.next;
                    return head;
                }

                Node nextnode = temp.next;
                Node prevnode = temp.prev;

                if(nextnode != null)
                {
                    nextnode.prev = prevnode;
                }
                if(prevnode != null)
                {
                    prevnode.next = nextnode;
                }
            }
            else
            {
                temp = temp.next;
            }

        }
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

    public static void main(String[]args)
    {
        head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        
        int key = 10;
        print(head);
    }
    
}
