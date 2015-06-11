package com;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by kawrobel on 2015-05-14.
 */
public class Palindromes
{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int count = reader.nextInt();
        int len;
        char buf = 'a';
        String s = "123";
        s = 8 + s;
        System.out.println(s);
        for(int i = 0; i < count; i++){
            boolean odd = false;
            String st = reader.next();
            len = st.length();
            int half = len/2;
            int[] firstH = new int[half];
            int[] secH = new int[half];
            if(len%2 != 0){
                buf = st.charAt(half);
                odd = true;
            }
            System.out.println(odd);
            if(odd == false)
                for(int j = 0; j < half; j++){
                    firstH[j] = Character.getNumericValue(st.charAt(j));
                    secH[j] = Character.getNumericValue(st.charAt(half+j));
                }
            else
                for(int j = 0; j < half; j++){
                    firstH[j] = Character.getNumericValue(st.charAt(j));
                    secH[j] = Character.getNumericValue(st.charAt(half+1+j));
                }
            /*for(int j = 0; j < half; j++)
            {
                System.out.println(firstH[j]);
                System.out.println(secH[j]);
            }*/
        }
    }
}
