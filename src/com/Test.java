package com;

/**
 * Created by kawrobel on 2015-05-21.
 */
public class Test
{
    public static void main(String[] args){
        bar();

    }
    static void bar(){
        String s = new String("Hello");
        int num = 6;
        int [] array = {1, 2, 3, 4};
        int result = 0;
        System.out.println(foo(234));
    }

    static int foo(int n){
        if (n < 1){
            return 0;
        } else {
            return 1 + foo(n / 10);
        }
    }
}
