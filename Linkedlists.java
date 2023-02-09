import java.util.*;
public class Linkedlists {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        //We can create a LinkedList with a Stack
        linkedList.push("A");
        linkedList.push("B");

        //We can also create a LinkedList with a Queue
        linkedList.offer("C");
        linkedList.offer("D");


        linkedList.add(4 , "E");
        System.out.println(linkedList.peekLast());
        linkedList.remove("D");

        System.out.println(linkedList);


    }
}
