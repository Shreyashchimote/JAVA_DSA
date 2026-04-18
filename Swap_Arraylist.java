import java.util.*;
public class Swap_Arraylist{
    public static void swap(ArrayList<Integer> list,int idx1, int idx2){
        int temp=list.get(idx1);
        list.set(idx1, idx2);
        list.set(idx2,temp);
    }
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
        swap(list, idx1, idx2);
        System.out.println(list);
        Collections.sort(list);//Ascending order of list
        System.out.println(list);    
        Collections.sort(list, Collections.reverseOrder()); //Collections.reverseOrder() is a comparator, comparator are fxn in java which defines the logic of sorting
        System.out.println(list); // Descending order of list
    }
    
}