// add element at end
public class DoubleLL2 
{
    class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    Node tail;

    public void addAtEnd(int data)
    {
        Node newNode = new Node(data);
        if(head == null )
        {
            head = newNode;
            tail = newNode;
        }

        else
        {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display()
    {
        
    }
    
}
