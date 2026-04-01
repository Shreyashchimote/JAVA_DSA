// import java.util.*;
public class Bit_Manipulation{
    public static void isoddoreven(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    public static void getbit(int n, int i) {
        System.out.println((n>>i)&1);  // my logic
        // apna clg logic
        // if(((n)&(1<<i))>0){
        //     System.out.println(1);
        // }else{System.out.println(0);}
    }
    public static int setbit(int n, int i){
        int bitmask=1<<i;
        return (n | bitmask);
    }
    public static int clearbit(int n, int i){
        int bitmask=1<<i;
        return (n & (~bitmask));
    }
    public static int clearlastbits(int n, int i) {
        int bitmask=-1<<i;
        return (n&bitmask);
    }
    public static int updatebit(int n, int i, int ubit){
         int bitmask=1<<i;
        if(((n>>i)&1)!=ubit){
        return (n ^ bitmask);
    }
    return n;
    }
    public static int clrrangebits(int n, int i, int j) {
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    public static boolean ispowerof2(int n){
        return (n & (n - 1)) == 0;
    }
    public static int numofsetbit(int n){
        int bitmask=1;
        int count=0;
        while(n>0){
            if((n&bitmask)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static int fastexpo(int a, int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*(a);
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        // System.out.println(5&6);
        // System.out.println(5|6);
        // System.out.println(5^6);
        // System.out.println(~0);
        // System.out.println(5<<2);
        // System.out.println(6>>1);
        // int n=6;
        // isoddoreven(n);
        // isoddoreven(2);
        // isoddoreven(7);
        // getbit(10, 2);
        // System.out.println(setbit(10, 2));
        // System.out.println(clearbit(10, 1));
        // System.out.println(updatebit(10, 1, 0));
        // System.out.println(clearlastbits(15, 2));
        // System.out.println(clrrangebits(10, 2, 4));
        // System.out.println(ispowerof2(6));
        System.out.println(numofsetbit(15));
        System.out.println(fastexpo(5, 5));

    }
}