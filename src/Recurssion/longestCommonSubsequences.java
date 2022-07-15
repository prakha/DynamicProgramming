package Recurssion;

public class longestCommonSubsequences {

    public static void main(String[] args) {
        String X = "abcde";
        String Y = "ace";
        int n = X.length();
        int m = Y.length();
        int ans = longestCommonSubsequences(X, Y, n, m);
        System.out.println(ans);
    }

    static int longestCommonSubsequences(String X, String Y, int n, int m){
        if(n == 0 || m == 0){
            return 0;
        }
        if (X.charAt(n-1) == Y.charAt(m-1)){
            return 1 + longestCommonSubsequences(X, Y, n-1, m-1);
        }
        else{
            return max(longestCommonSubsequences(X, Y, n, m-1), longestCommonSubsequences(X, Y, n-1, m));
        }
    }

    static int max(int a, int b){
        return (a > b) ? a : b;
    }
}
