//insert an element at beginning

public class Doublell1 
{
    class DoubleLLNode
    {
        int data;
        
        DoubleLLNode next;
        DoubleLLNode prev;

        public DoubleLLNode(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
           
        }
    }
    DoubleLLNode head;
    DoubleLLNode tail;
    public void insertAtbegin(int data)
    {
        DoubleLLNode newNode = new DoubleLLNode(data);
        
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            
        }
    }

    public void display()
    {
        DoubleLLNode current = head;
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    } 
    
    public static void main(String[]args)
    {
        Doublell1 dl = new Doublell1();
        dl.insertAtbegin(10);
        dl.insertAtbegin(5);
        dl.display();
    }
}
