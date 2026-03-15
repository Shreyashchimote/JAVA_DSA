public class factorialfunction {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int binomialco(int n,int r) {
        int binoialcoefficient= factorial(n)/(factorial(r)*factorial(n-r));
        return binoialcoefficient;
        
    }
    public static void main(String[] args) {
        int binofcto=binomialco(5,2);
        System.out.println(binofcto);
    }
}
