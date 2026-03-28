import java.util.*;
public class Pair_sum_2{
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=17;
        System.out.println(ispresent(list,target));
    }
    public static boolean ispresent(ArrayList<Integer> list,int target){
        int bp=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int rp=bp; int lp=bp+1;
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }else if(list.get(lp)+list.get(rp)>target){
                rp=(list.size()+rp-1)%list.size();
            }else{
                lp=(lp+1)%list.size();
            }
        }
        return false;
    }
}