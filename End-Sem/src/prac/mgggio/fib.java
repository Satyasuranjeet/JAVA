package prac.mgggio;

public class fib {
    static int fibo(int n){
        if(n<2){
            return n;

        }
        else return(fibo(n-2)+fibo(n-1));
    }
   static int facto(int i,int sum){
        if(i==0)
            return sum;
        return facto(i-1,sum*i);
   }
   static int mia(int k){
        if(k==0)
            return 1;
        else{
            int count=0;
            count++;
            return mia(k*count);
        }
   }
    public static void main(String[] args) {
        System.out.println(fibo(6));
        System.out.println(facto(0,1));
    }
}
