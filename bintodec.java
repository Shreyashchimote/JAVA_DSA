public class bintodec {
    public static int decimal(int n){
        int pow=0;
        int dec=0;
         while (n > 0) {
            int lastDigit = n % 10;                  
            dec = dec + lastDigit * (int)Math.pow(2, pow);
            pow++;
            n = n / 10;                             
        }
        return dec;
    }
    public static void main(String[] args) {
        int decimalval=decimal(1000);
        System.out.println(decimalval);
    }
    }


