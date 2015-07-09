package codility;

/**
 * Created by kawrobel on 2015-06-26.
 */
public class MinAvgTwoSlice
{
    public static void main(String[] args){
        int[] A = {-1,1,-1,1,1,-1,-1,-1};
        System.out.println(solution(A));
    }

    public static int solution(int[] A){
        int len = A.length;
        if(len == 2){
            return 0;
        }
        int indexOfTwoos = 0;
        int indexOfThrees = 0;
        double avgOfTwos = 0;
        double minOfTwos = (A[0]+A[1])/2.0;
        double avgOfThrees = 0;
        double minOfThrees = (A[0] + A[1] + A[2])/3.0;

        for(int i = 1; i < len - 1; i++){
            avgOfTwos = (A[i] + A[i+1])/2.0;
            if(avgOfTwos < minOfTwos){
                indexOfTwoos = i;
                minOfTwos = avgOfTwos;
            }
            avgOfThrees = (A[i-1] + A[i] + A[i+1])/3.0;
            if(avgOfThrees < minOfThrees){
                indexOfThrees = i-1;
                minOfThrees = avgOfThrees;
            }
        }
        if(minOfThrees < minOfTwos){
            return indexOfThrees;
        }
        return indexOfTwoos;
    }

}
