import java.util.*;
public class Queues {
    public static void main(String[] args){
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Ace");
        queue.offer("Kyle");
        queue.offer("Stillo");
        queue.offer("Welcome");      //to queue

        System.out.println(queue);
        System.out.println(queue.peek());

        queue.poll();                   // to dequeue
        System.out.println(queue);

        System.out.println(queue.contains("Xileng"));



////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Priority Queue

        Queue<Double> queue1 = new LinkedList<>();
        Queue<Double> queue2 = new PriorityQueue<>(Collections.reverseOrder()); //highest to lowest

        queue2.offer(65.5);
        queue2.offer(49.5);
        queue2.offer(89.0);
        queue2.offer(72.4);

        while (!queue1.isEmpty()) {
            System.out.println(queue2.poll());
        }


    }
}
