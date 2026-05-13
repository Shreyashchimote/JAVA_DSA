// import java.util.ArrayList;

public class StackB {
    // static class Stack {
    //     ArrayList<Integer> list = new ArrayList<>();

    //     public boolean isEmpty() {
    //         return list.isEmpty();
    //     }

    //     public void push(int data) {
    //         list.add(data);
    //     }

    //     public int pop() {
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         int top = list.get(list.size() - 1);
    //         list.remove(list.size() - 1);
    //         return top;
    //     }

    //     public int peek() {
    //         if(isEmpty()){
    //             return -1;
    //         }
    //         return list.get(list.size() - 1);
    //     }
    // }
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head;
        public boolean isEmpty(){
            return head==null;
        }
        public void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}