public class insert 
{
    Node head;
    class Node 
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
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

    public static void main(String[] args) 
    {
        insert ll = new insert();
        ll.addFirst("a");
        ll.addFirst("is");
        ll.addLast("list"); 
        ll.printList(); 
        
        
    }
}
