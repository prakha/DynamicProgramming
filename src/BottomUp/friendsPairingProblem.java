package BottomUp;

public class friendsPairingProblem {

    public static void main(String[] args) {
        int ans = numberOfPair(4);
        System.out.println(ans);
    }

    static int numberOfPair(int N){


        if(N == 1){
            return 1;

        }
        int[] t = new int[N+1];
        t[0] = 0;
        t[1] = 0;
        t[2] = 1;
        for(int i = 3; i <= N; i++){
            t[i] = t[i-1] + (i-1);
        }
        return (t[N] + 1);
    }
}
