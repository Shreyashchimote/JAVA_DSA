public class dectobin {
    public static int bin(int n){
        int pow=0;
        int bin=0; 
        while(n>0){
            bin=bin+((n%2)*(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }    return bin;
    }public static void main(String[] args) {
        System.out.println(bin(8));

    }

}
