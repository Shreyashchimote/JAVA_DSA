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
    public int removeFirst(){
        if(size==0){
            System.out.println("THe linked list is Empty");
            return Integer.MIN_VALUE;
        }if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removelast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int searchKey(int target){
        Node temp=head;
        int count=0;
        while(temp!=null){
            if(temp.data==target){
                return count;
            }
            temp=temp.next;
            count++;
        }
        return -1;
    }
    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;

    }
    public int recuSearch(int key){
        return helper(head, key);
    }
    public void reverselist(){
        Node prev=null;
        Node curr=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void removeElementFromLast(int n){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;
            return;
        }
        int i=1;
        int ithnode=sz-n;
        Node prev=head;
        while(i<ithnode){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        // return;
    }
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean  checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node mid=findmid(head);
        //swap 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;
        while (curr!=null) { 
            next=curr.next;
            curr.next=prev;
            curr=next;
        } 
        Node right=prev;
        Node left=head;
        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll= new LinkedList();
        
        ll.addFirst(1);
        
        ll.addFirst(0);
        
        ll.addLast(2);
        
        ll.addLast(3);

        ll.add(2, 9);
        ll.printList();
        // ll.removeFirst();
        // ll.printList();
        // ll.removelast();
        // ll.printList();
        // System.out.println("Size of LinkedList is:"+ll.size);
        // System.out.println("target is at: "+ll.searchKey(1));
        // System.out.println("target is at: "+ll.recuSearch(2));
        // ll.reverselist();
        // ll.printList();
        ll.removeElementFromLast(3);
        ll.printList();
        System.out.println(ll.findmid(head).data);
        System.out.println(ll.checkPalindrome());
        
        
    }
    
}