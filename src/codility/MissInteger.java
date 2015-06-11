package codility;

import java.util.ArrayList;

/**
 * Created by kawrobel on 2015-05-28.
 */
public class MissInteger
{

    public static void main(String[] args){
        int[] A = {1};
        System.out.println(solution(A));
    }

    private static int solution(int[] A){
        int N = A.length;
        boolean[] bol = new boolean[N+1];
        int min = 1;
        for(int i = 0; i < N; i++){
            if(A[i] < 1)
                continue;
            else{
                if(A[i] <= N)
                    bol[A[i]-1] = true;
            }
        }

        for(int i = 0; i <= N; i++){
            if(bol[i] == false)
                return i+1;
        }
        return min;
    }
}
