import java.util.ArrayList;
public class Array_list{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(); // <String>||<Character>||<Boolean>
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1, 9);
        System.out.println(list);
        int elememt=list.get(3); // Get element index
        System.out.println(elememt);
        list.remove(2);
        System.out.println(list);
        list.set(2,10);
        System.out.println(list);
        System.out.println(list.contains(2));
        System.out.println(list.contains(9));
        System.out.println("Size of ArrayList is: "+list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max=Math.max(max, list.get(i));
        }
        System.out.println("Maximum number in list is: "+max);
    }
}