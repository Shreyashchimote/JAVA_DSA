import java.util.*;
public class Swap_Arraylist{
    public static void main(String[] args) {
    ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1, 9);
        System.out.println(list);
        int idx1=3;
        int idx2=5;
        int temp=list.get(idx1);
        list.set(idx1, idx2);
        list.set(idx2,temp);
        System.out.println(list);    
    }
    
}