public class primeNum {
    public static void main(String[] args) {
        int n=8;
        int root = (int) Math.pow(n, 0.5);
        for(int i=2;i<=root;i++){
            if (n%i==0){
                System.out.println("Not prime");
            }else{
                System.out.println("prime");
            }
        }
        
    }

}
