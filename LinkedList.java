public class LinkedList {
    public static class Node{
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
    
    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
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
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while (i<idx-1) { 
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        
        ll.addFirst(1);
        
        ll.addFirst(0);
        
        ll.addLast(2);
        
        ll.addLast(3);

        ll.add(2, 9);
        ll.printList();
        System.out.println("Size of LinkedList is:"+ll.size);
    }
    
}