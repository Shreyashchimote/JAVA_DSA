 public class GridWays {

//     public static int  gridways(int x, int y, int n, int m){
//         //base case
//         if(x==n-1 && y==m-1){
//             return 1;
//         }else if(x==n || y==m){
//             return 0;
//         }
//         int w1=gridways(x, y+1, n, m);
//         int w2=gridways(x+1, y, n, m);
//         return w1+w2;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         System.out.println(gridways(0, 0, n, m));
//     }
// }


    public long factorial(int n){
        long fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public int gridWays(int n, int m){
        long numerator = factorial(n + m - 2);
        long denominator = factorial(n - 1) * factorial(m - 1);

        return (int)(numerator / denominator);
    }

    public static void main(String[] args){
        int n=3;
        int m=3;
        GridWays obj = new GridWays();  
        System.out.println(obj.gridWays(n, m));
    }
}