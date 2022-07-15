package Recurssion;

public class subsetSum {
    static boolean[][] t = new boolean[102][1002];
    public static void main(String[] args) {

       // for(int i = 0; i < 102; i++) {
         //   for (int j = 0; j < 1002; j++) {
           //     if(i == 0){
             //       t[i][j] = false;
               // }
               // if(j == 0){
                 //   t[i][j] = true;
               // }
           // }
        //}
        int sum = 9;
        int[] arr = {4, 34, 12, 5, 2};
        boolean check = find(arr, sum, arr.length);
        System.out.println(check);

    }

    static boolean find(int[] arr, int sum, int n){
        if(sum == 0){
            return true;
        }
        if(n == 0){
           return false;
        }
        if(arr[n-1] > sum) {
            return find(arr, sum, n - 1);
        }
        return (find(arr, sum - arr[n-1], n-1) || (find(arr, sum, n-1)));
    }
}
