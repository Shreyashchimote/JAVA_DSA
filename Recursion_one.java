public class Recursion_one {
    public static void print_increasenum(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        print_increasenum(n-1);
        System.out.println(n+"");
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact_N=factorial(n-1);
        int factorialOfN=n*fact_N;
        return factorialOfN;

    }
    public static int sumOfN_naturalNum(int n){
        if(n==1){
            return 1;
        }
        int prev_n=sumOfN_naturalNum(n-1);
        int sum_n=n+prev_n;
        return sum_n;
    }
    public static int fabnocci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int fab_n1=fabnocci(n-1);
        int fab_n2=fabnocci(n-2);
        return fab_n1+fab_n2;
    }

    public static boolean issorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }
    public static int firstOccurance(int arr[], int i, int key) {
        if(i==arr.length-1){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return firstOccurance(arr, i+1, key);
    }
    public static int lastOccurance(int arr[], int i, int key) {
        if(i==arr.length-1){
            return -1;
        }
        int isfound=lastOccurance(arr, i+1, key);
        if (isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static int power(int X, int n){
        int result;
        if(n==0){
            return 1;
        }
        if(n%2==0){
            int half_pow=power(X, n/2);
            result=half_pow* half_pow;
        }
        else{
            int half_pow=power(X, n/2);
            result=X*half_pow*half_pow;
        }
        return result;
        
    }


    public static void main(String[] args) {
        // int arr[]={1,4,6,4,5};
        int n=power(2, 5);
        System.out.println(n);
    }
}
