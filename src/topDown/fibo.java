package topDown;

public class fibo {

    static int[] fib = new int[100];
    static int Findfib(int n){
        if(n < 2){
            return n;
        }

        if(fib[n] != -1){
            return  fib[n];
        }
        fib[n] = Findfib(n-1) + Findfib(n-2);
        return fib[n];
    }

    public static void main(String[] args) {
        int n =3;
        for(int i = 0; i < 100; i++){
            fib[i] = -1;
        }
        int ans = Findfib(n);
        System.out.println(ans);
    }

}
