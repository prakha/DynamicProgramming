package Recurssion;

public class equalSumPartition {

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 9, 2};
        int n = arr.length;
        boolean ans = findPartition(arr, n);
        System.out.println(ans);

    }

    static boolean findPartition(int[] arr, int n){
        int sum = 0;
        n = arr.length;
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }
        if(sum%2 != 0){
            return false;
        }

        return isSubsetSum(arr, sum/2, n);
    }

    static boolean isSubsetSum(int[] arr, int sum, int n){

        if(sum == 0){
            return true;
        }
        if(sum != 0 && n == 0){
            return false;
        }

        if(arr[n-1] > sum){
            return isSubsetSum(arr, sum, n-1);
        }

        return isSubsetSum(arr, sum - arr[n-1], n-1 ) || isSubsetSum(arr, sum, n-1);

    }
}
