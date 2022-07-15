package Recurssion;

public class binomialCoefficient {

    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        int ans = nCr(n, k);
        System.out.println(ans);

    }

    static int nCr(int n, int r){
        int[][] dp = new int[n+1][r+1];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < r; j++){


                if(i == 0){
                    dp[i][j] = 1;
                }
                if(j == 0){
                    dp[i][j] = 1;
                 }
            }
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < r; j++){
                dp[i][j] = (i/j) * dp[i-1][j-1];
            }
        }

        return dp[n][r];




    }

    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
