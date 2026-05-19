import java.util.*;
public class Max_Area_Histogram{
    public static int[] nextSmallerLeft(int height[]){
        Stack <Integer> s= new Stack<>();
        int nsl[]=new int[height.length];
        for(int i=0;i<nsl.length;i++){
            if(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        return nsl;
    }
    public static int[] nextSmallerRight(int height[]){
        Stack <Integer> s= new Stack<>();
        int nsr[]=new int[height.length];
        for(int i=nsr.length-1;i>=0;i--){
            if(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=nsr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        return nsr;
    }
    public static int maxArea(int height[]){
        int left[]=nextSmallerLeft(height);
        int right[]=nextSmallerRight(height);
        int maxarea=0;
        for(int i=0,j=0,h=0; i<left.length && j<right.length && h<height.length;i++,j++,h++){
            int area=height[h]*(right[j]-left[i]-1);
            maxarea=Math.max(maxarea, area);
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int height[]={2,1,5,6,2,3};
        System.out.println(maxArea(height));
    }
}