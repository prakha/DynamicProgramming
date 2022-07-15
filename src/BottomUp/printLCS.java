package BottomUp;

public class printLCS {

    public static void main(String[] args) {

        String X = "abcdef";
        String Y = "acgjhf";
        String ans = printLCS(X, Y, X.length(), Y.length());
        System.out.println(ans);


    }

    static String printLCS(String X, String Y, int m, int n){
        int[][] dp = new int[m+1][n+1];


        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        for(int i = 1;i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(X.charAt(i-1) == Y.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        int i = m;
        int j = n;

        String lcs = "";
        while(i > 0 && j > 0){
            if(X.charAt(i-1) == Y.charAt(j-1)){
                lcs += X.charAt(i-1);
                i--;
                j--;
            }
            else{
                if(dp[i][j-1] > dp[i-1][j]){
                    j--;
                }
                else{
                    i--;
                }
            }
        }

        StringBuilder s1 = new StringBuilder(lcs);

        s1.reverse();
        return s1.toString();




    }


}
