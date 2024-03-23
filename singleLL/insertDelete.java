public class insertDelete 
{
    private int size;
    insertDelete()
    {
        this.size = 0;
    }
    Node head;
    class Node 
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add @first
    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
     
    // add@second
    public void addLast(String data)
    {
        Node newNode = new Node(data);  //checks if head is empty
        if(head == null)
        {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //print 
    public void printList()
    {
      
        if(head == null)
        {
            System.out.println("the list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //deletefirst
    public void deletefirst()
    {
        if(head == null)
        {
            System.out.println("The list is empty");
        }
        size--;
        head = head.next;
    }

    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("The list is empty");
        }
        size--;
        Node secondlast = head;
        Node last = head.next;
        while(last.next != null)
        {
            last = last.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public int gettingsize()
    {
        return size;
    }

    public static void main(String[] args) 
    {
        insertDelete ll = new insertDelete();
        ll.addFirst("this");
        ll.addLast("is");
        ll.addLast("the");
        ll.addLast("beginning");
        
        ll.printList();

        ll.deletefirst();
        ll.printList();
        ll.deleteLast();
        ll.printList();

        //size;

        System.out.println(ll.gettingsize());
        

        
        
    }
}
