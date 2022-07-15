package BottomUp;

public class equalSumPartition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5};
        int n = arr.length;
        boolean ans = findPartition(arr);
        System.out.println(ans);
    }

    static boolean findPartition(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        if(sum%2 != 0){
            return false;
        }
        else {
            return isSubset(arr, sum/2, n);
        }
    }
    static boolean isSubset(int[] arr, int sum, int n){
        boolean[][] t = new boolean[n+1][sum+1];
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < sum+1; j++){
                if(i == 0){
                    t[i][j] = false;
                }
                if(j == 0){
                    t[i][j] = true;
                }
            }
        }
        for (int i = 1; i < n + 1; i++){
            for(int j = 1; j < sum + 1; j++){
                if(arr[i-1] <= j){
                    t[i][j] = (t[i-1][j-arr[i-1]]) || (t[i-1][j]);
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}
