package com;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by kawrobel on 2015-05-14.
 */
public class Palindromes2
{
    public static  boolean odd = false, done = false, append = false;

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int count = reader.nextInt();
        int len;
        char buf = 'a';
        for(int i = 0; i < count; i++){
            done = false;
            odd = false;
            append = false;
            StringBuilder st = new StringBuilder(reader.next());
            len = st.length();
            if(len == 1){
                System.out.println(oneInt(st));
                continue;
            }
            if(len%2 == 1){
                odd = true;
            }
            if(odd == false)
                st = doEven(st, len);
            else
                st = doOdd(st, len);

            System.out.println(st);
        }
    }

    public static StringBuilder doEven(StringBuilder str, int len){
        int half = len/2;
        for(int j = 0; j < half; j++){
            if(done == false)
            {
                if(str.charAt(half - 1 - j) <= str.charAt(half + j))
                {

                    done = true;
                    int k = half - 1 - j;
                    while(k >= 0) {
                        if(str.charAt(k) == '9')
                        {
                            if(k == 0)
                            {
                                append = true;
                            }
                            str.setCharAt(k, '0');
                            str.setCharAt(k + 1 + j, '0');
                        } else
                        {
                            int ch = str.charAt(k);
                            str.setCharAt(k, (char) ++ch);
                            str.setCharAt(len - k, (char) ch);
                            break;
                        }
                        k--;
                    }
                }
                else {
                    done = true;
                    str.setCharAt(half + j, str.charAt(half - 1 - j));
                }
            }else{
                str.setCharAt(half + j, str.charAt(half - 1 - j));
            }
        }
        if(append){
            str.setCharAt(len-1, '1');
            str.insert(0, '1');
        }
        return str;
    }

    private static StringBuilder oneInt(StringBuilder str) {
        if(str.charAt(0) == '9')
        {
            str.setCharAt(0, '1');
            str.insert(0, '1');
        }
        else{
            int ch = str.charAt(0);
            str.setCharAt(0, (char) ++ch);
        }
        return str;
    }
    private static StringBuilder doOdd(StringBuilder str, int len)
    {
        int half = len/2;
        char buf = str.charAt(half);
        str.deleteCharAt(half);
        len = str.length();
        half = len/2;
        for(int j = 0; j < half; j++){
            if(done == false)
            {
                if(str.charAt(half - 1 - j) <= str.charAt(half + j))
                {

                    done = true;
                    int k = half - 1 - j;
                    while(k >= 0) {
                        if(str.charAt(k) == '9')
                        {
                            if(k == 0)
                            {
                                append = true;
                            }
                            str.setCharAt(k, '0');
                            str.setCharAt(k + 1 + j, '0');
                        } else
                        {
                            int ch = str.charAt(k);
                            str.setCharAt(k, (char) ++ch);
                            System.out.println(str.charAt(k));
                            str.setCharAt(len - k, (char) ch);
                            break;
                        }
                        k--;
                    }
                }
                else {
                    done = true;
                    str.setCharAt(half + j, str.charAt(half - 1 - j));
                }
            }else{
                str.setCharAt(half + j, str.charAt(half - 1 - j));
            }
        }
        if(append){
            str.setCharAt(len - 1, '1');
            str.insert(half, '0');
            str.insert(0, '1');
        }else{
            str.insert(len/2, buf);
        }
        return str;
    }
}
