package BottomUp;

public class paintTheFence {

    public static void main(String[] args) {
        int n = 10;
        int k = 2;
        int ans = function(n, k);
        System.out.println(ans);

    }

    static int function(int n, int k){
        if(n==0){
            return 0;
        }
        if(n == 1){
            return k;
        }
        int same = k;
        int diff = k * (k-1);

        for(int i = 3; i <= n; i++){
            int prev = (diff);
            diff = (same + diff) * (k-1);
            same = prev;
        }

        return (same + diff);
    }


}
