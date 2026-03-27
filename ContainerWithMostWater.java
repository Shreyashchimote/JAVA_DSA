import java.util.*;
public class ContainerWithMostWater{
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(8);
        height.add(7);
        height.add(2);
        height.add(1);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        System.out.print(Mostwater(height));
    }
    public static int Mostwater(ArrayList<Integer> height) {
        // BRUTE FORCE APPROACHE
        // int maxArea=0;
        // for(int i=0;i<height.size();i++){
        //     for(int j=i+1; j<height.size();j++){
        //         int width = j - i;
        //         int h = Math.min(height.get(i), height.get(j));
        //         int area = width * h;
        //         maxArea=Math.max(maxArea, area);
        //     }
        // }
        // 2 pointer approach
        int firstpointer=0;
        int lastpointer=height.size()-1;
         int maxArea=0;
        while(firstpointer<lastpointer){
            int width=lastpointer-firstpointer;
            int ht=Math.min(height.get(firstpointer),height.get(lastpointer));
            int area=width*ht;
            maxArea=Math.max(maxArea, area);
            if(height.get(firstpointer)<height.get(lastpointer)){
                firstpointer++;
            }else{
                lastpointer--;
            }
        }
        return(maxArea);
    }
}