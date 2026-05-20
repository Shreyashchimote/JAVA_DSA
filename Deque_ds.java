import java.util.*;
public class Deque_ds{
    public static void main(String[] args) {
        Deque<Integer> deq=new ArrayDeque<>();
        deq.addFirst(1);
        deq.addFirst(2);
        deq.addLast(3);
        deq.addLast(4);
        System.out.println(deq);
        deq.removeLast();
        System.out.println(deq);
    }
}