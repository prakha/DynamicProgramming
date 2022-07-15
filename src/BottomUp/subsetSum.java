package BottomUp;

public class subsetSum {

    static boolean[][] t = new boolean[102][1002];
    public static void main(String[] args) {
        for(int i = 0; i < 102; i++) {
            for (int j = 0; j < 1002; j++) {
                if(i == 0){
                    t[i][j] = false;
                }
                if(j == 0){
                    t[i][j] = true;
                }
            }
        }

        int sum = 9;
        int[] arr = {4, 34, 12, 5, 2};
        boolean check = find(arr, sum, arr.length);
        System.out.println(check);


    }

    static boolean find(int[] arr, int sum, int n){
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < sum+1; j++){
                if(arr[i-1] <= j){
                    t[i][j] = (t[i-1][j-arr[i-1]] || t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}
