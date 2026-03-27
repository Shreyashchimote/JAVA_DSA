import java.util.*;
public class MultiDimensionalAl{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist= new ArrayList<>();
        ArrayList<Integer> sublist= new ArrayList<>();
        for(int i=1;i<6;i++){
            sublist.add(i);
        }
        mainlist.add(sublist);
        ArrayList<Integer> sublist1= new ArrayList<>();
        for(int i=1;i<6;i++){
            sublist1.add(i*2);
        }
        mainlist.add(sublist1);
        ArrayList<Integer> sublist2= new ArrayList<>();
        for(int i=1;i<6;i++){
            sublist2.add(i*3);
        }
        mainlist.add(sublist2);
        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer> currlist=mainlist.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainlist);

    }
}