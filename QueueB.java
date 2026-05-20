public class QueueB{
    // static class Queue{
    //     static  int arr[];
    //     static  int size;
    //     static  int rear;
    //     static  int front;

    //     Queue(int n){
    //         arr=new int[n];
    //         size=n;
    //         rear=-1;
    //         front=-1;
    //     }
    //     public static boolean isEmpty(){
    //         return rear==-1 && front==-1;
    //     }
    //     public static boolean isFull(){
    //         return (rear+1)%size==front;
    //     }

    //     public static void add(int data){
    //         if(rear==size){
    //             System.out.println("Queue is Full");
    //             return;
    //         }
    //         if(front==-1){
    //             front=0;
    //         }
    //         rear=(rear+1)%size;
    //         arr[rear]=data;
    //     }
    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("Stack is Empty");
    //             return -1;
    //         }
    //         int result=arr[front];
    //         if(rear==front){
    //             rear=front=-1;
    //         }else{
    //             front=(front+1)%size;
    //         }
    //         return result;
    //     }
    //     public static int peek(){
    //        if(isEmpty()){
    //             System.out.println("Stack is Empty");
    //             return -1;
    //         }
    //         return arr[front]; 
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
    static class Queue{
        static Node head=null;
        static  Node tail=null;

        public static boolean isEmpty(){
            return head==null && tail==null;
        }
        public static void add(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            int front=head.data;
            if(head==tail){
                head=tail=null;
            } else {
                 head = head.next;
            }
            return front;
        }
        public static int peek(){
           if(isEmpty()){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.data; 
        }  
    }
    public static void printqueue(Queue q){
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Queue q1=new Queue();
        q1.add(0);
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(45);
        printqueue(q1);

    }
}