package codility;

/**
 * Created by kawrobel on 2015-06-26.
 */
public class PassingCars
{
    public static void main(String[] args){
         int[] A = {0,1,0,1,1};
        System.out.println(solution(A));
    }

    public static int solution(int[] A){
        final int MAX = 1000000000;
        int passingCars = 0;
        int lastZero = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == 0){
                lastZero += 1;
            }
            if(A[i] == 1 && lastZero != 0){
                passingCars += lastZero;
            }
            if(passingCars > MAX )
                return -1;
        }

        return passingCars;
    }
}
