package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length");
        int size = Integer.parseInt(reader.readLine());
        for (int i=1;i<=size;i++){
            for (int j = 1; j <= size; j++)
            {
                if(j<=i)
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
