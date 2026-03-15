

public class Recursion_two {
    public static int tilling_problem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int Verticaltiling=tilling_problem(n-1);
        int Horizontaltiling=tilling_problem(n-2);
        int t_ways=Verticaltiling+Horizontaltiling;
        return t_ways;
    }
    public static void duplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currentchar=str.charAt(idx);
        if(map[currentchar-'a']==true){
            duplicate(str, idx+1, newStr, map);
        }
        else{
            map[currentchar-'a']=true;
            duplicate(str, idx+1, newStr.append(currentchar), map);
        }
    }
    public static int frndPairs(int n){
        if(n==1 || n==2){
            return n;
        }
        int singlefrnd=frndPairs(n-1);
        int pairedfrnd=(n-1)*frndPairs(n-2);
        int total_ways=singlefrnd+pairedfrnd;
        return total_ways;
    }

    public static void main(String[] args) {
        // String str="appnacollege";
        
        // boolean map[]=new boolean[26];

        // duplicate(str, 0,new StringBuilder(" "), map);
        System.out.println(frndPairs(3));
    }
}
