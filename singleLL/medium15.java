// https://leetcode.com/problems/add-two-numbers/
class Node {
    int data;
    Node next;

    Node() {
    }

    Node(int data) {
        this.data = data;
    }

    Node(int data, Node next) {
        this.data= data;
        this.next = next;
    }
}

public class medium15 
{
    public static Node add(Node l1, Node l2)
    {
        Node result = new Node(0);
        Node ptr = result;
    
        int carry = 0 ;
        while(l1 != null || l2 != null)
        {
            int sum = 0;

            if(l1 != null)
            {
                sum += l1.data;
                l1 = l1.next;
            }

            if(l2 != null)
            {
                sum += l2.data;
                l2 = l2.next;
            }
            
            sum = sum+carry;

            carry = sum/10;
            sum = sum%10;
            ptr.next = new Node(sum);
            ptr = ptr.next;

        }
        if(carry == 1)
        {
            ptr.next = new Node(1);

        }
        Node ans = result.next;
        return ans;
          
    }
    public static void print(Node ans)
    {
        Node temp = ans;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage
        Node l1 = new Node(9);
        l1.next = new Node(9);
        l1.next.next = new Node(9);
        l1.next.next.next = new Node(9);
        l1.next.next.next.next = new Node(9);
        l1.next.next.next.next.next = new Node(9);
        l1.next.next.next.next.next.next = new Node(9);
       
        Node l2 = new Node(9);
        l2.next = new Node(9);
        l2.next.next = new Node(9);
        l2.next.next.next = new Node(9);

        Node anss = add(l1, l2);
        print(anss);

        

        
    }
}
