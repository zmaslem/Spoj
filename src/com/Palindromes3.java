package com;

import java.util.Scanner;

/**
 * Created by kawrobel on 2015-05-18.
 */
public class Palindromes3
{
    final static int maxLen = 998;
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int count = reader.nextInt();
        for(int i = 0; i < count; i++)
        {
            StringBuilder str = new StringBuilder(reader.next());
            StringBuilder str2 = new StringBuilder(str);
            int len = str.length();
            str = addOne(str, len);
            len = str.length();
            if(isPal(str, 0, len - 1, len)) {
                System.out.println(str);
                continue;
            }

            if(len % 2 == 0){
                str = manageEven(str, len);
                System.out.println(str);
                continue;
            }
            else{
                str = manageOdd(str, str.length());
                System.out.println(str);
                continue;
            }
        }
    }

    private static StringBuilder manageOdd(StringBuilder str, int len){
        char middle = str.charAt(len/2);
        int half = len/2;
        boolean done = false;
        if((int) str.charAt(half-1) <= (int) str.charAt(half+1)){
            if(middle == '9'){
                str.setCharAt(half, '0');
                int prev = (int) str.charAt(half-1);
                str.setCharAt(half-1, (char) ++prev);
                str.setCharAt(half+1, (char) prev);
            }
            else if(middle == '0'){

            }
            else{
                int mid = (int) str.charAt(half);
                str.setCharAt(half, (char) ++mid);
                str.setCharAt(half + 1, str.charAt(half - 1));
            }
            done = true;
        }
        for(int i = 0; i < half; i++){
            if(done == true){
                str.setCharAt(half+1+i, str.charAt(half -1 - i));
                continue;
            }
            if(str.charAt(half -1 - i) < str.charAt(half+1+i)){
                int letter = (int)str.charAt(half -1 - i);
                str.setCharAt(half - 1 - i, (char) ++letter);
                str.setCharAt(half+1+i, (char) letter);
                done = true;
            }
            else if(str.charAt(half -1 - i) == str.charAt(half+1+i))
                continue;
            else{
                str.setCharAt(half+1+i, str.charAt(half-1-i));
                done = true;
            }
        }
        return str;
    }

    private static StringBuilder manageEven(StringBuilder str, int len){
        int half = len/2;
        boolean done = false;
        StringBuilder str2;

        for(int i = 0; i < half; i++){
            if(done == true){
                str.setCharAt(half + i, str.charAt(half - i -1));
                continue;
            }
            if(str.charAt(half - i -1) < str.charAt(half + i)){
                int letter = (int)str.charAt(half - i -1);
                str.setCharAt(half - i -1, (char) ++letter);
                str.setCharAt(half + i, (char) letter);
                done = true;
            }
            else if(str.charAt(half - i -1) == str.charAt(half + i)){

                    int letter = (int) str.charAt(half - i - 1);
                    str.setCharAt(half - i - 1, (char) ++ letter);
                    str.setCharAt(half + i, (char) letter);
                    done = true;
            }
            if(str.charAt(half - i -1) == str.charAt(half + i))
            {
                continue;
            }
            else{
                str.setCharAt(half + i, str.charAt(half - i -1));
                done = true;
            }
        }
        return str;
    }

    private static StringBuilder nine(StringBuilder str, int index){
        str.setCharAt(index, '0');
        if(index == 0){
            str.insert(0, '1');
        }
        else{
            if(str.charAt(index-1) == '9'){
                str = nine(str, index-1);
            }
            else{
                int letter = (int) str.charAt(index-1);
                str.setCharAt(index-1, (char)++letter);
            }
        }
        return str;
    }

    private static boolean isPal(StringBuilder str, int i, int j, int len){
        boolean is = true;
        while(is && i < len/2){
            is = checkLetter(str.charAt(i), str.charAt(j));
            i++;
            j--;
        }
        return is;
    }

    private static StringBuilder addOne(StringBuilder str, int len){
        if(str.charAt(len-1) == '9'){
             str = nine(str, len-1);
        }
        else{
            int letter = (int) str.charAt(len-1);
            str.setCharAt(len-1, (char) ++letter);
        }

        return str;
    }

    private static boolean checkLetter(char a, char b){
        return a == b;
    }


}
