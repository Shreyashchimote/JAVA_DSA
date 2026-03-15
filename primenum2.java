public class primenum2 {
    
   public static boolean isprime(int a) {
    if (a <= 1) return false;
    if (a == 2) return true;

    int root = (int)Math.sqrt(a);
    for (int i = 2; i <= root; i++) {
        if (a % i == 0) {
            return false;  // immediately return
        }
    }
    return true;  // no divisors found
}

    public static void primeRange(int n) {
        for (int i = 2; i < n; i++){
            if(isprime(i)==true){
                System.out.print(i+ " ");
            }
        }
        
    }
    public static void main(String[] args) {
        
        primeRange(16);
    }
}



