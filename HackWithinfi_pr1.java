import java.util.*;
public class HackWithinfi_pr1{
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int A[]= new int[n];
        for(int j=0;j<n;j++){
            int i=sc.nextInt();
            A[j]=i;
        }
        int qlen= sc.nextInt();
        int q[][]=new int[qlen][4];
        for (int i = 0; i <qlen; i++) {
            for(int j=0;j<4;j++){
                q[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < qlen; i++) {
            int l = q[i][0];
            int r = q[i][1];
            int x = q[i][2];
            int y = q[i][3];

            for (int j = l; j <= r; j++) {
                A[j] = x + (j - l) * y;
            }
        }
        System.out.println(Asum(A));
        
    }
    public static int Asum(int A[]){
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
        }
        return sum;
    }
}