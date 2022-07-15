package BottomUp;

public class knapSack {


    static int[][] t = new int[102][1002];
    public static void main(String[] args) {

        for(int i = 0; i < 102; i++) {
            for (int j = 0; j < 1002; j++) {
                if(i == 0 || j == 0){
                    t[i][j] = 0;
                }
            }
        }

        int[] val = {1, 4, 5, 7};
        int[] wt = {1, 3, 4, 5};
        int W = 7;
        int n = val.length;
        int ans = knapSack(wt, val, W, n);
        System.out.println(ans);


    }

    static int knapSack(int[] wt, int[] val, int W, int n){

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < W + 1; j++){
                if(wt[i-1] <= j){
                    t[i][j] = Math.max(val[i-1] + t[i-1][j - wt[i-1]], t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][W];


    }
}
