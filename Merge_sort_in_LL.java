// import java.util.LinkedList;
public class Merge_sort_in_LL{
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
    private Node getmid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    private Node merge(Node head1, Node head2){
        Node mergedll=new Node(-1);
        Node temp=mergedll;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
               temp.next=head1;
               head1=head1.next;
               temp = temp.next;
            }else{
               temp.next=head2;
               head2=head2.next;
               temp = temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp = temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //get mid;
        Node mid=getmid(head);
        //Right half
        Node Righthead=mid.next;
        mid.next=null;
        Node lefthalf= mergeSort(head);
        Node righthalf=mergeSort(Righthead);

        return merge(lefthalf, righthalf);

    }
    public static void main(String[] args) {
        Merge_sort_in_LL ll=new Merge_sort_in_LL();
        ll.addLast(9);
        ll.addLast(5);
        ll.addLast(11);
        ll.addLast(8);
        ll.addLast(3);
        ll.printList();
        ll.head=ll.mergeSort(ll.head);
        ll.printList();


    }
}