package prac.booooooofofd;

public class rec {
    static boolean isprime(int n,int i){
        if(n<=2)
            return (n==2) ?true:false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isprime(n, i + 1);
        }
        static int gp(int arr[]){
        int s=0;
        for(int i=0;i<arr.length;i++){
            if(isprime(arr[i],2)&& arr[i]>s){
                s=arr[i];
            }

    }
        return s;
}

    public static void main(String[] args) {
        int a[]={1,2,5,9,11,23,7,17,797};
        System.out.println(gp(a));
    }
}
