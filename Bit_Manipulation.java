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
        getbit(10, 2);
        System.out.println(setbit(10, 2));
        System.out.println(clearbit(10, 1));
        System.out.println(updatebit(10, 1, 0));
        System.out.println(clearlastbits(15, 2));

    }
}