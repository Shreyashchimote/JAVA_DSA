public class Find_Subset{
    public static void findstring(String str, String subset, int i){
        if(i==str.length()){
            if(subset.length()==0){
                System.out.print("null");
            }else{
            System.out.print(subset+ " ");
            }
            return;
        }
        findstring(str, subset+str.charAt(i), i+1);
        findstring(str, subset, i+1);
    }
    public static void main(String args[]){
        String str="abc";
        String subset="";
        findstring(str,subset,0);

    }
}