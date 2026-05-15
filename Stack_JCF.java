import java.util.*;
public class Stack_JCF{
    public static void pushatbottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushatbottom(s, data);
        s.push(top);
    }
    public static String reverststring(String str){
        Stack <Character> s=new Stack<>();
        int i=0;
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder result=new StringBuilder();
        while(!s.isEmpty()){
            result.append(s.peek());
            s.pop();
        }
        return result.toString();
    }
    public static void reversestack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reversestack(s);
        pushatbottom(s, top);
    }
    public static void printstack(Stack<Integer> s){
         while (!s.isEmpty()) { 
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
    public static void main(String[] args) {
        Stack <Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        pushatbottom(s, 6);
       
        // System.out.println(reverststring("Hello World"));
    
        reversestack(s);
        printstack(s);
    }
}