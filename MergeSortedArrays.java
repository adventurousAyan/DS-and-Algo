package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
       int[] arr1 = {1,3,5,7};
       int[] arr2 = {0,2,6,8,9};

       //Merge two sorted arrays using extra-space
       int[] newArr = new int[arr1.length + arr2.length];

        int k = 0;
        int j = 0;
       for(int i = 0; i<newArr.length; i++) {
           if(k != arr1.length && j != arr2.length) {
               if (arr1[k] > arr2[j]) {
                   newArr[i] = arr2[j];
                   j++;
               } else {
                   newArr[i] = arr1[k];
                   k++;
               }
           }
           else if(j !=  arr2.length){
               newArr[i] = arr2[j];
               j++;
           }
           else if(k != arr1.length) {
               newArr[i] = arr1[k];
               k++;
           }
       }   
    }
}
