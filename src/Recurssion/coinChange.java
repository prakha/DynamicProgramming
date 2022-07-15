package Recurssion;

public class coinChange {

    public static void main(String[] args) {
        int[] coin = {1, 2, 3};
        int numberOfcoins = coin.length;
        int amount = 5;
        int ans = maximumNumberOfWays(coin, numberOfcoins, amount);
        System.out.println(ans);
    }
    static int maximumNumberOfWays(int[] arr, int n,int amount){
        if(amount == 0){
            return 1;
        }
        if(amount < 0){
            return 0;
        }
        if(n <= 0 && amount>=1){
            return 0;
        }
        return maximumNumberOfWays(arr, n-1, amount) + maximumNumberOfWays(arr, n, amount - arr[n-1]);
    }


}
