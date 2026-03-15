public class Permutation{
    public static void findPermu(String str, String ans){
        if(str.length()==0){
            System.out.print(ans+ " ");
            return;
        }
        
        for(int i=0;i<str.length();i++){
            char currentchar=str.charAt(i);
            String Newstr=str.substring(0,i)+str.substring(i+1);
            findPermu(Newstr, ans+currentchar);
        }
    }
    public static void main(String args[]){
        String str="abcd";
        String ans="";
        findPermu(str,ans);
    }
}