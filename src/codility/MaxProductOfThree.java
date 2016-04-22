package codility;

/**
 * Created by kawrobel on 2015-07-10.
 */
public class MaxProductOfThree
{
    public static void main(String[] args){
        int[] A = {-5, -6, -4, -7, -10};
        System.out.println(findMax(A));

    }
    public static int findMax(int[] A){
        int[] min = {1000, 1000, 1000};
        int[] max = {-1000, -1000, -1000};
        int len = A.length;
        int maxProd = 0;
        boolean isZero = false;
        if(len == 3)
            return A[0]*A[1]*A[2];
        for(int i = 0; i < len; i++){
            if(A[i] < min[0]){
                min[2] = min[1];
                min[1] = min[0];
                min[0] = A[i];
            }
            else if(A[i] >= min[0] && A[i] <= min[1]){
                min[2] = min[1];
                min[1] = A[i];
            }
            else if(A[i] >= min[0] && A[i] >= min[1] && A[i] <= min[2]){
                min[2] = A[i];
            }

            if(A[i] > max[0]){
                max[2] = max[1];
                max[1] = max[0];
                max[0] = A[i];
            }
            else if(A[i] <= max[0] && A[i] >= max[1]){
                max[2] = max[1];
                max[1] = A[i];
            }
            else if(A[i] <= max[0] && A[i] <= max[1] && A[i] >= max[2]){
                max[2] = A[i];
            }
            if(A[i] == 0) isZero = true;
        }
        System.out.println(min[0] + " " + min[1] + " " + min[2]);
        System.out.println(max[0] + " " + max[1] + " " + max[2]);

        if(min[0] < 0 && min[1] < 0 && min[2] < 0 && max[0] < 0 && max[1] < 0 && max[2] < 0 && isZero)
            return 0;
        if(max[0] < 0){
            return max[0] * max[1] * max[2];
        }
        if(max[0] > 0 && max[1] > 0 && max[2] > 0){
            if(max[0] * max[1] * max[2] > maxProd)
                maxProd = max[0] * max[1] * max[2];
        }
        if(max[0] > 0 && min[0] < 0 && min[1] < 0){
            if(max[0] * min[0] * min[1] > maxProd)
                maxProd = max[0] * min[0] * min[1];
        }
        return maxProd;
    }
}


