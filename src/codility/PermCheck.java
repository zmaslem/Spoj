package codility;

/**
 * Created by kawrobel on 2015-05-26.
 */
public class PermCheck
{
    public static void main(String[] args){
        int[] A = {4, 1, 3, 2};
        System.out.println(solution(A));

    }

    public static int solution(int[] A){
        int N = A.length;
        int max = 0;
        if(N == 0)
            return 0;
        else if(N == 1){
            if (A[0] == 1)
                return 1;
            else
                return 0;
        }

        for(int i = 0; i < N; i++){
            if(max < A[i])
                max = A[i];
            if (max > N)
                return 0;
        }

        boolean[] b = new boolean[N+1];
        for(int i = 0; i < N; i++){
            if(b[A[i]] == true){
                return 0;
            }
            else
                b[A[i]] = true;
        }

        for(int i = 1; i <= N; i++){
            if(b[i] == false)
                return 0;
        }
        return 1;
    }
}
