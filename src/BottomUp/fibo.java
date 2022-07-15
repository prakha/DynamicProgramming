package BottomUp;

import java.util.Scanner;

public class fibo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Findfib(n);
        System.out.println(ans);

    }
    //BottomUpApproach
    static int findFib(int n){
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for(int i = 2; i <= n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }

    static int Findfib(int n){
        if(n == 2 || n==3){
            return 1;
        }
        int prev = 1, curr = 1;
        for(int i = 3; i <= n; i++){
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr + 1;


    }
}
