package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
      int arr[] = new int[10];
      Random random = new Random();
      int i, largest;
        System.out.print("Random array: ");
      for (i = 0; i < 10; i++){
      arr[i] = random.nextInt(100)+1;
          System.out.print(arr[i]+" ");
      }
      largest=arr[0];
      for (i=1; i<10; i++){
          if(arr[i] > largest){
              largest=arr[i];
          }
      }
        System.out.println("\n Maximum number in array: "+largest);
    }
}
