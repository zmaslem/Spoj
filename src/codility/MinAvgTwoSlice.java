package codility;

/**
 * Created by kawrobel on 2015-06-26.
 */
public class MinAvgTwoSlice
{
    public static void main(String[] args){
        int[] A = {4, 2, 2, 5, 1, 5, 8};
        solution(A);
    }

    public static int solution(int[] A){
        int len = A.length;
        int[] sums = new int[len];
        int minavg = 0;
        sums[0] = A[0];
        for(int i = 1; i < len; i++){
            sums[i] = sums[i-1] + A[i];
        }

        return 0;
    }

}
