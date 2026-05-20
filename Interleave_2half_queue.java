import java.util.*;
public class Interleave_2half_queue{
    public static void interleaveQueue(Queue<Integer> q){
        Queue <Integer> qfirst=new ArrayDeque<>();
        int size=q.size();
        for (int i = 0; i < size / 2; i++) {
            qfirst.add(q.remove());
        }
        while(!qfirst.isEmpty()){
            q.add(qfirst.remove());
            q.add(q.remove());
        }
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q= new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interleaveQueue(q);
    }
}