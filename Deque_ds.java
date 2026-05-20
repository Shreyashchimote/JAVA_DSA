import java.util.*;
public class Deque_ds{
    static class Stack{
        static Deque<Integer> dq=new ArrayDeque<>();
        public static boolean isEmpty(){
            return dq.isEmpty();
        }
        public static void push(int data){
            dq.addLast(data);
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.removeLast();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.getLast();
        }
    }
    static  class Queue{
        static Deque<Integer> dq=new ArrayDeque<>();
        public static boolean isEmpty(){
            return dq.isEmpty();
        }
        public static void add(int data){
            dq.addLast(data);
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.removeFirst();
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return dq.getFirst();
        }


    }
    public static void main(String[] args) {
        // Deque<Integer> deq=new ArrayDeque<>();
        // deq.addFirst(1);
        // deq.addFirst(2);
        // deq.addLast(3);
        // deq.addLast(4);
        // System.out.println(deq);
        // deq.removeLast();
        // System.out.println(deq.getFirst());
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Stack elements are: ");
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
        System.out.println();
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("Queue elements are: ");
        while (!q.isEmpty()) { 
            System.out.print(q.peek()+" ");
            q.remove();
        }

    }
}