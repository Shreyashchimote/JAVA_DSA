public class Doublyll{
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addfirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void addlast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        newNode.prev=tail;
        newNode.next=null;
        tail=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " <-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("No element in LL");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public void removeLast(){
        tail=tail.prev;
        tail.next=null;
    }
    public void reversedll(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        Doublyll dll=new Doublyll();
        dll.addfirst(2);
        dll.addlast(1);
        dll.addfirst(0);
        dll.printList();
        // dll.removeFirst();
        // dll.printList();
        // System.out.println(dll.size);
        dll.reversedll();
        dll.printList();


    }
}