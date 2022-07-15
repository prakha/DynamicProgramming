package BottomUp;

public class countOfSubset {

    //public static void main(String[] args) {

    //}

    //static int count(int[] arr, int n, int sum){
      //  int tab[][] = new int[n+1][sum+1];

        //tab[0][0] =
    //}

    public static void main(String[] args) {
        String s = "babad";
        String p = longestSubstring(s);
        System.out.println(p);
    }

    static String longestSubstring(String S){
        String p = "";
        int i = 0;
        int j = 0;
        int maxLength = 0;
        int n = S.length();

        while(j < n){
            if(isPallindrome(S.substring(i, j))){
                if((j-i+1) > maxLength){
                    maxLength = j-i+1;
                    p = S.substring(i, j);
                    j++;
                }

            }
            else{
                i++;
            }
        }
        return p;
    }

    static boolean isPallindrome(String S) {
        // code here
        for(int i = 0; i < S.length()/2; i++){
            char start = S.charAt(i);
            char end = S.charAt(S.length() - 1 - i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
}
