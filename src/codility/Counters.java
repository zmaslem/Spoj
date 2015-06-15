package codility;

/**
 * Created by kawrobel on 2015-06-11.
 */
public class Counters
{
    public static void main(String[] args){
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] B = solution(5, A);
        for(int i : B){
            System.out.println(i);
        }
    }

    public static int[] solution(int N, int[] A){
        int[] B = new int[N];
        int len = A.length;
        int max = 0;
        int buf = 0;
        for(int i = 0; i < len; i++)
        {
            if(A[i] > 0 && A[i] < N+1){
                if(B[A[i]-1] < max)
                    B[A[i]-1] += max - B[A[i]-1] +1;
                else
                    B[A[i]-1] += 1;
                if(B[A[i]-1] > buf)
                    buf =  B[A[i]-1];
            }
            else if(A[i] == N+1)
                max = buf;
        }
        for(int i = 0; i<N; i++){
            if(B[i] < max)
                B[i] = max;
        }
        System.out.println("max="+max);
        return B;
    }
}
