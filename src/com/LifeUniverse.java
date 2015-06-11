package com;

import java.util.Scanner;

/**
 * Created by kawrobel on 2015-05-14.
 */
public class LifeUniverse
{

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int n;
        do{
            n = reader.nextInt();
            if(n != 42)
            System.out.println(n);
        }while( n != 42) ;
    }
}
