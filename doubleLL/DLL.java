public class DLL 
{
    class Node{
        int data;
        Node prev;
        Node next;
        int pos;

        Node(int data)
        {
            this.data = data;
            this.prev= null;
            this.next = null;
        }
    }

    class Doublell
    {
        Node head;
        Node tail;


        Doublell()
        {
            this.head = null;
            this.tail = null;
        }
    }

    Doublell d = new Doublell();

    public void insertAtbegin(int data)
    {
        Node newNode = new Node(data);
        
        if(d.head == null)
        {
            d.head = newNode;
            d.tail = newNode;
        }
        else
        {
            newNode.next = d.head;
            d.head.prev = newNode;
            d.head = newNode;
        }
    }
    public void insertAtend(int data)
    {
        Node newNode = new Node(data);
        
        if(d.head == null)
        {
            d.head = newNode;
            d.tail = newNode;
        }
        else
        {
            newNode.prev = d.tail;
            d.tail.next = newNode;
            d.tail = newNode;
        }
    }

    public void deleteAtbegin()
    {
        if(d.head == null)
        {
            System.out.println("the list is empty");
        }

        //if there is onlly one node
        if(d.head == d.tail)
        {
            d.head = null;
            d.tail = null;
        }
        else
        {
            Node temp = d.head;
            d.head = d.head.next;
            d.head.prev = null;
            temp.next = null; // disconnecting the deleted node
        }
    }

    public void deleteAtEnd()
    {
        if(d.head == null)
        {
            System.out.println("the list is empty");
        }

        //if there is onlly one node
        if(d.head == d.tail)
        {
            d.head = null;
            d.tail = null;
        }
        else
        {
            Node temp = d.tail;
            d.tail = d.tail.prev;
            d.tail.next = null;
            temp.prev = null;
        }
    }
    

   

    public void display()
    {
        
        Node current = d.head;
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[]args)
    {
        DLL dll = new DLL();
        dll.insertAtbegin(10);
        dll.insertAtbegin(5);
        dll.insertAtend(15);
        dll.display();

        dll.deleteAtbegin();
        dll.display();

        dll.deleteAtEnd();
        dll.display();
        
    }
}
