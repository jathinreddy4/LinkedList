public class medium1
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    static Node head;

    static class solution
    {
        public  static Node midnode()
        {
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }

    public static void main(String[]args)
    {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node mid = solution.midnode();
        System.out.println(mid);

        
    }
}
