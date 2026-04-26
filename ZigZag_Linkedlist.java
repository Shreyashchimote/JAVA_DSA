public class ZigZag_Linkedlist{
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " -->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    // private Node getmid(Node head){
    //     Node slow=head;
    //     Node fast=head.next;
    //     while(fast!=null && fast.next!=null){
    //         slow=slow.next;
    //         fast=fast.next.next;
    //     }
    //     return slow;
    // }
    public void zigzagll(){
         Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node lefthead=head;
        Node righthead=prev;
        Node nextLeft, nextRight;
        while(lefthead!=null && righthead!=null){
            nextLeft=lefthead.next;
            lefthead.next=righthead;
            nextRight=righthead.next;
            righthead.next=nextLeft;

            righthead=nextRight;
            lefthead=nextLeft;
        }

    } 
    public static void main(String[] args) {
        ZigZag_Linkedlist ll=new ZigZag_Linkedlist();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.printList();
        ll.zigzagll();
        ll.printList();
    }
}