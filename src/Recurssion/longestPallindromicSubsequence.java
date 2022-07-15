package Recurssion;

public class longestPallindromicSubsequence {

    public static void main(String[] args) {
        String S = "cbbd";
        int m = S.length();
        //String s1 = S.substring(m-2, m-2);
        //int ans = longestPallindromicSubsequence(S, m);
       // System.out.println(ans);
    }

    //static int longestPallindromicSubsequence(String s, int m){
      //  if(m == 0){
        //    return 0;
        //}
       // if(!isPallindrome(s.substring(m-1))){
         //   return longestPallindromicSubsequence(s.substring(0, m-2), m-1);
      //  }
      //  else{
        //    return Math.max(1+longestPallindromicSubsequence(s.substring(m), m-1), longestPallindromicSubsequence(s., m-1));
     //   }
    //}

   // static boolean isPallindrome(String S){
     //   for(int i = 0; i < S.length()/2; i++){
       //     char start = S.charAt(i);
         //   char end = S.charAt(S.length() - 1 - i);

           // if(start != end){
             //   return false;
            //}
       // }
       // return true;
   // }

}
