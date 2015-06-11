package codility;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kawrobel on 2015-05-27.
 */
public class FrogLeaf
{

    public static void main(String[] args){
        int[] A = {1};
        System.out.println(solution(1, A));
    }

    public static int solution(int X, int[] A){
        int N = A.length;
        boolean[] leafs = new boolean[X];
        if(N == 1){
            if(A[0]==1)
                return 0;
        }
        if (N < X){
            return -1;
        }
        for(int i = 0; i < N; i++){

            if(leafs[A[i]-1] == false){
                leafs[A[i]-1] = true;
                X--;
            }
            if(X == 0){
                return i;
            }

        }
        if(X == 0)
            return N;
        return -1;
    }
}
