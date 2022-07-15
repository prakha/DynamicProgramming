package Recurssion;

public class knapsack {


    public static void main(String[] args) {

        int[] val = {1, 4, 5, 7};
        int[] wt = {1, 3, 4, 5};
        int W = 7;
        int n = val.length;
        int ans = knapSack(W, wt, val, n);
        System.out.println(ans);


    }

    static int knapSack(int W, int[] wt, int[] val, int n){
        //Base Case
       // if(n == 0 || W == 0){
         //   return 0;
       // }
       // if(wt[n-1] > W){
         //   return knapSack(W, wt, val, n-1);
      //  }

        //return Math.max(val[n-1] + knapSack(W-wt[n-1], wt, val, n-1), knapSack(W, wt, val, n-1));

        if(n == 0 || W== 0){
            return 0;
        }
        if(wt[n-1] > W){
            return knapSack(W, wt, val, n-1);
        }
        return Math.max(val[n-1] + knapSack(W-wt[n-1], wt, val, n-1), knapSack(W, wt, val, n-1));
    }
}
