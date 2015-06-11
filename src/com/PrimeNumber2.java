package com;

import java.util.*;

/**
 * Created by kawrobel on 2015-05-13.
 */
public class PrimeNumber2
{
    static int count = 0;
    static int max = 100001;
    static boolean[] hs;

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        hs = leavePrimes(max);
        count = reader.nextInt();
        int numbers;
        for (int i = 0; i < count; i++){
            numbers = reader.nextInt();
            if(hs[numbers]==false)
                System.out.println("TAK");
            else
                System.out.println("NIE");
        }
    }
    private static boolean[] leavePrimes(int max) {
        boolean hs[] = new boolean[max+1];
        hs[1] = true;
        for (int i = 2; i*i <= max; i++) {
            for(int h = 2*i; h <= max; h+=i){
                hs[h] = true;
            }
        }
        return hs;
    }
}
