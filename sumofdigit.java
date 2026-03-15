public class sumofdigit {
    public static int sumodigit(int n){
        int sum=0;
        while(n>0){
            int ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int ans=(sumodigit(54));
        System.out.println(ans);
    }
    }


