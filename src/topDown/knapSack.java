package topDown;

public class knapSack {

    static int[][] t = new int[102][1002];

    public static void main(String[] args) {
        for(int i = 0; i < 102; i++) {
            for (int j = 0; j < 1002; j++) {
                t[i][j] = -1;
            }
        }
        int W = 7;
        int n = 4;
        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int ans = knapSack(W, n, wt, val);
        System.out.println(ans);
    }

    static int knapSack(int W, int n, int[] wt, int[] val){
        if(n == 0 || W == 0){
            return 0;
        }
        if(t[n][W] != -1){
            return t[n][W];
        }
        if(wt[n-1] > W){
            t[n][W] = knapSack(W, n-1, wt, val);
            return  t[n][W];
        }

        else{
            t[n][W] = Math.max(val[n-1] + knapSack(W-wt[n-1], n-1, wt, val), knapSack(W, n-1, wt, val));
            return t[n][W];
        }
    }
}
