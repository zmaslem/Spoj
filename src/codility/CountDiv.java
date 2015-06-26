package codility;

/**
 * Created by kawrobel on 2015-06-26.
 */
public class CountDiv
{
    public static void main(String[] args){

    }

    public static int solution(int A, int B, int K){
        int counter = 0;
        int helper = 0;
        helper = A%K;
        if(helper == 0)
            counter++;
        helper = A-helper;
        counter += (B-helper)/K;
        return counter;
    }
}
