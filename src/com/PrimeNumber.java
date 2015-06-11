package spoj;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by kawrobel on 2015-05-12.
 */
class PrimeNumber
{
    static int count = 0;
    static HashSet hs = new HashSet();
    static int max = 0;

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        count = reader.nextInt();
        int numbers[] = new int[count];
        for (int i = 0; i < count; i++){
            numbers[i] = reader.nextInt();
            if (numbers[i] > max)
                max = numbers[i];
        }
        hs = genHash(max);
        for (int i = 0; i < count; i++){
            if(hs.contains(numbers[i]))
                System.out.println("TAK");
            else
                System.out.println("NIE");
        }
    }



    private static HashSet genHash(int bound){
        HashSet hs = new HashSet();
        for(int i = 2; i <= bound; i++){
            hs.add(i);
        }
        hs = leavePrimes(hs, bound);
        return hs;
    }

    private static HashSet leavePrimes(HashSet hs, int max) {
        int j = 0;
        double sqrt = Math.sqrt(hs.size());

        if (sqrt%2 != 0)
            j = (int) sqrt + 1;
        else
            j = (int) sqrt;

        for (int i = 2; i < j; i++) {
            int h = 0, k = 1;

            while(h <= max){
                h++;k++;
                if(hs.contains(i*k)) {
                    hs.remove(i * k);
                }
            }
        }
        return hs;
    }
}
