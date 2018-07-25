package com.company;

public class Main {

    public static void main(String[] args) {
	int[] values = {5, 77, 4, 60, 8, 10, 11, 50, 80, 99};
	int longest = values[0];
	for (int i =0; i < values.length; i++) {
	    if (values[i] > longest){
	        longest = values[i];
        }
        }
        System.out.print(longest);
    }
}
