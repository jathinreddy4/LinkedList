import java.util.*;
public class singleLinked 
{
    public static void main(String args[])
    {
        LinkedList<String> ll = new LinkedList<>();
        //add
        ll.addFirst("a");
        ll.addFirst("is");
        ll.addFirst("This");
        ll.addLast("game");

        System.out.println(ll);

        System.out.println(ll.size());

        //delete
        ll.removeFirst();
        System.out.println(ll);

        ll.removeLast();
        System.out.println(ll);

        //can use index to delete particular element
        ll.remove(0);
        System.out.println(ll);

    }    
}
