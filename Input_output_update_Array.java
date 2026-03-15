import java.util.*;
public class Input_output_update_Array {
    public static void main(String[] args) {
        int marks[]=new int[10];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        marks[1]=100;
        marks[2]=marks[2]+1;
        
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks.length);
    }


}
