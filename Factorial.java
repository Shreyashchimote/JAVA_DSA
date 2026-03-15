import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int product=1;
        if(n==0){
            System.out.println("Factorial of"+n+"is"+1);
        }else{
            for(int i=1;i<=n;i++){
                product=product*i;
            }
        }System.out.print(product);
    }
}
