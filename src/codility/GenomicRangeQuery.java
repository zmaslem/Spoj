package codility;

/**
 * Created by kawrobel on 2015-07-01.
 */
public class GenomicRangeQuery
{
    public static void main(String[] args){
        String S = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};

        P = solution(S, P, Q);
        for(int i : P){
            System.out.println(i);
        }
    }

    public static int[] solution(String S, int[] P, int[] Q){
        int len = S.length();
        int[][] vec = new int[len][4];
        int[] res = new int[P.length];
        for(int i = 0; i < len; i++){
            char c = S.charAt(i);
            if(c == 'A')
                vec[i][0] = 1;
            if(c == 'C')
                vec[i][1] = 1;
            if(c == 'G')
                vec[i][2] = 1;
            if(c == 'T')
                vec[i][3] = 1;
        }
        for(int i = 1; i < len; i++){
            for(int j = 0; j < 4; j++)
                vec[i][j] += vec[i-1][j];
        }

        for(int i = 0; i < P.length; i++){
            int x = P[i];
            int y = Q[i];
            for(int j = 0; j < 4; j++){
                int sub = 0;
                if(x-1 >= 0)
                    sub = vec[x-1][j];
                if(vec[y][j] - sub > 0){
                    res[i] = j+1;
                    break;
                }
            }
        }
        return res;
    }
}
