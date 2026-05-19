import java.util.*;
public class Duplicate_parentheses{
    public static boolean isDuplicate(String str){
        Stack <Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='(' || ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%'||(ch >= 'a' && ch <= 'z')){
                s.push(ch);
            }else{
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                s.pop();
                if(count<1){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str="((a+b)+(c+d))";
        System.out.println(isDuplicate(str));
    }
}