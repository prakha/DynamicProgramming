package BottomUp;

public class coinChangeBottomUp {

    public static void main(String[] args) {
        int[] coin = {1, 2, 3};
        int n = Integer.MAX_VALUE - 1;
        int ans = coinChange(coin, 4);
        System.out.println(ans);
    }

    static int coinChange(int[] coins, int amount){
        int n = coins.length;
        int[][] t = new int[n+1][amount+1];
        t[0][0] = 1;
        for(int i = 1; i <= amount; i++){
            t[0][i] = 0;
        }
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= amount; j++){
                if(coins[i-1] > j){
                    t[i][j] = t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j] + t[i][j - coins[i-1]];
                }
            }
        }
        return t[n][amount];
    }
}
