import java.util.*;
public class Pair_sum_1{
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=5;
        System.out.println(ispresnt(list, target));
    }
    public static boolean ispresnt(ArrayList<Integer> list,int target){
        // for(int i=0; i<list.size();i++){
        //     for(int j=i+1;j<list.size();j++){
        //         if(list.get(i)+list.get(j)==target){
        //             return true;
        //         }
        //     }
        // }
        int st=0;
        int end=list.size()-1;
        while(st<end){
            if(list.get(st)+list.get(end)==target){
                return true;
            }else if(list.get(st)+list.get(end)>target){
                end--;
            }else{
                st++;
            }
        }
            return false;
    }
}